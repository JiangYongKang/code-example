// 在 src 目录下输入 gulp -v 检查版本
// 如果能正确输出版本，直接在 src 目录下输入 gulp 执行下面定义的任务
const gulp = require("gulp");

// 转译 JavaScript，命令： gulp webpack
gulp.task("webpack", () => {
    const webpack = require("webpack-stream");
    const config = require("./webpack.config.js");
    gulp.src("./js/**/*.js")
        .pipe(webpack(config))
        .pipe(gulp.dest("../www/js"));
});

// 编译 less，命令：gulp less
gulp.task("less", () => {
    const less = require("gulp-less");
    gulp.src("./less/*.less")
        .pipe(less())
        .pipe(gulp.dest("../www/css"));
});

// 将上面两个任务合并到 default 任务中，这样直接输入 gulp 就可以默认的执行 "webpack" 和 "less" 这两个任务。
gulp.task("default", ["webpack", "less"]);
