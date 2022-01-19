package Day13_Switch_And_ScannerIntro;

public class HTTP {
    public static void main(String[] args) {
        int status = 200;
        String result = "";

        switch (status) {
            case 200:
                result = "ok";
                break;

            case 201:
                result = "Created";
                break;

            case 202:
                result = "Accepted";
                break;

            case 301:
                result = "Moved Permanently";
                break;
            default:
                result = "invalid";
        }
        System.out.println(result);
    }

}

 /*   HTTP is the protocol that governs communications between web-servers and web clients.
        Part of the protocol includes a status code returned
        by the server to tell the browser the status of its most recent page request.
        Some of the codes and their meanings are listed below:

        status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable


        declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

        Example:
        if status code = 200

        output:
        ok

  */