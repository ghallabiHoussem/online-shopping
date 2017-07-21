<p class="lead">Categories ESA</p>
<div class="list-group">

	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/listProducts/category/${category.id}" class="list-group-item" id="a_${category.name}" >${category.name}</a>
	</c:forEach>

</div>