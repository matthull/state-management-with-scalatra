package com.example.jobmanagementservice

import org.scalatra._
import scalate.ScalateSupport

class JobManagementServiceServlet extends JobManagementServiceStack {

  get("/") {
    <html>
      <body>
        <h1>The Job Management Service is <span style="color: green; margin-top: 26px;">UP</span></h1>
      </body>
    </html>
  }

}
