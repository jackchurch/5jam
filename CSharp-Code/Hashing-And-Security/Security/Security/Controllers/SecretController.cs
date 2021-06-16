using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Security.Controllers
{
    //[Authorize]
    public class SecretController : Controller
    {
        // GET: Secret
        [Authorize(Users = "j@j.local")]
        public ContentResult Secret()
        {
            return Content("Secret info here");
        }

        [AllowAnonymous]
        public ContentResult PublicInfo()
        {
            return Content("Public info here");
        }


        //public ActionResult Index()
        //{
        //    return View();
        //}
    }
}