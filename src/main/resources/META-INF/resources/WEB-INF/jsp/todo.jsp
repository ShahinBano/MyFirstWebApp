<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Add Todos Page</title>
</head>
<body>
    <div class="container">
        <%@ include file="common/navigation.jspf"%>
        <h1>Enter Todo Details</h1>
        <form:form method="post" modelAttribute="todo">

        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="date">Target Date</form:label>
            <form:input type="text" path="date" required="required"/>
            <form:errors path="date" cssClass="text-warning"/>
        </fieldset>

           <form:input type="hidden" path="id"/>
           <form:input type="hidden" path="done"/>
           <input type="submit" class="btn btn-success" />
        </form:form>
    </div>


      <%@ include file="common/footer.jspf" %>

     <script type="text/javascript">
        $('#date').datepicker({
            format: 'yyyy-mm-dd',
        });
        </script>