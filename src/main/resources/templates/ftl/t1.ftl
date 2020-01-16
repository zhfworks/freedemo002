<table border="1">
    <tr>
        <th>name</th>
        <th>email</th>
    </tr>
    <!-- 遍历输出-->
    <#list userList as user>
        <tr>
            <th>${user.name}</th>
            <th>${user.email}</th>
        </tr>
    </#list>
</table>