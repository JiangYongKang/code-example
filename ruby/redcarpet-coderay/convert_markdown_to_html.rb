require 'redcarpet'

class ConvertMarkdownToHtml

  def initialize(markdown_text)
    @markdown_text = markdown_text
  end

  def to_html
    renderer = Redcarpet::Render::HTML.new(html_render_options)
    markdown = Redcarpet::Markdown.new(renderer, markdown_options)
    markdown.render(@markdown_text)
  end

  def html_render_options
    {
      filter_html:     true,
      hard_wrap:       true,
      link_attributes: { rel: 'nofollow' }
    }
  end

  def markdown_options
    {
      fenced_code_blocks: true,
      lax_spacing:        true,
      no_intra_emphasis:  true,
      strikethrough:      true,
      superscript:        true
    }
  end
end