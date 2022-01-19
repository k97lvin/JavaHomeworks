package Day11_NestedIf;

public class HTTP_protocol {
    public static void main(String[] args) {
        int statusCode = 200;
        String status = "";
        status = (statusCode == 200) ? "ok" : (statusCode == 201) ? "created" : (statusCode == 202) ? "accepted" : (statusCode == 301) ?
                "Moved Permanently" : (statusCode == 303) ? "See other" : (statusCode == 304) ? "not modified"
                : (statusCode == 307) ? "Temporary redirect" : (statusCode == 400) ? "bad request"
                : (statusCode == 401) ? "unauthorized" : (statusCode == 403) ? "Forbidden" : (statusCode == 404) ? "not found"
                : (statusCode == 410) ? "gone" : (statusCode == 500) ? "internal server error" : (statusCode == 503) ? "Service Unavailable"
                : "wrong code";
        System.out.println(status);

    }
}
   /* HTTP is the protocol that governs communications between web-servers and web clients.
    Part of the protocol includes a status code returned by the server to tell the browser
    the status of its most recent page request.
        Some of the codes and their meanings are listed below:
        status codes and their meanings:
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


        declare an int variable called statusCode, and a valid status code is already given
        write a program that prints out, on a line by itself, the appropriate label from the above list
         based on status.

        Example:
        if status code = 200

        output:
        ok

        NOTE: MUST USE TERNARY.


    */