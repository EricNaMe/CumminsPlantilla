   <%@include file="TEMPpartes.jsp"%>
  
        <script src="js/matriz.js"></script>
        
        <div class="table-responsive" style="margin: 20px">
            <div class="container-body">
                <div class="table-responsive">
                    <div class="col-sm-5 form-inline">
                        <div style=" margin-bottom: 15px;">
                            <label style="margin-left: 22px;" for="dr">DR:</label>&nbsp;
                            <select readonly id ="dr" name="dr" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                        </div>
                        <div style="  margin-bottom: 15px;">
                            <label for="dealer">Dealer:</label>&nbsp;
                            <select id ="dealer" readonly name="dealer" class="form-control" style="width:200px; background-color:#ffffff;"></select><br>
                        </div>
                    </div>
                    <div class="col-sm-5 form-inline">
                        <div style="  margin-bottom: 15px;">
                            <label for="codigoDR">Codigo DR:</label>&nbsp;
                            <input type="text" disabled style=" margin-left: 22px;background-color:#ffffff;" id="codigoDR" name="codigoDR" size="4" class="form-control"><br>
                        </div>
                        <div style="  margin-bottom: 15px;">
                            <label for="codigoDeal">Codigo Dealer:</label>&nbsp;
                            <input type="text" disabled style="background-color:#ffffff;" name="codigoDeal" id="codigoDeal" size="4" class="form-control"><br>
                        </div>
                    </div>
                </div>
                <div class="table-responsive">
                    <label for="tableBody">Matrices Agrupadas</label>
                    <table id="tableBody" data-toggle="table">
                    </table><br>
                    <button type="button" class="btn btn-default" id="consultar">Consultar</button>
                    <button type="button" class="btn btn-default" id="atras">Atras</button>
                </div>
            </div>
        </div>

         <%@include file="footer.jsp"%>