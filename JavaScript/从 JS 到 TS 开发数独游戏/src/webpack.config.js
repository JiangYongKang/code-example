module.exports = {
    entry: {
        index: "./js/index"
    },
    output: {
        filename: "[name].js"
    },
    devtool: "source-map",
    resolve: {
        extensions: [".js"]
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                loader: "babel-loader",
                exclude: ["/Users/vincent/Sample Code/code-example/JavaScript/从 JS 到 TS 开发数独游戏/src/node_modules"],
                query: {
                    presets: ["es2015"]
                }
            }
        ]
    }
};
