function showMenu() {
    // console.log("funcionando");
    let menuContainer = document.querySelector('.container-menu-mobile');
    // console.log(menuContainer);
    if(menuContainer.classList.contains('open')) {
        menuContainer.classList.remove('open');
        // document.querySelector('menu-icon').src = "assets/static/img/close_white_36dp.svg"; 
    } else {
        menuContainer.classList.add('open');
        // document.querySelector('menu-icon').src = "assets//static/img/menu_while_36dp.svg"; 
    }
}

