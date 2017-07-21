<div class="container">

	<div class="row">

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<div class="col-md-3">
			<div class="row">
				<div class="col-lg-12">
				
					<c:if test="${userClickListProduct == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</a>
						</ol>
					</c:if>
					
					<c:if test="${userClickOneProduct == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
					
				</div>
			</div>
		</div>
	</div>

</div>