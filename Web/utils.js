/**
 * 动态加载脚本
 * @param {脚本网址/路径} url 
 */
function loadScript(url) {
    const script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = url;
    document.body.appendChild(script);
}

/**
 * 动态加载样式
 * @param {样式路径} url 
 */
function loadStyles(url) {
    const link = document.createElement('link');
    link.rel = 'stylesheet';
    link.type = 'text/css';
    link.href = url;
    const head = document.getElementsByTagName('head')[0];
    head.appendChild(link);
}