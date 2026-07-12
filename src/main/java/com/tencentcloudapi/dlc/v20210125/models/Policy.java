/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policy extends AbstractModel {

    /**
    * <p>需要授权的数据库名，填 * 代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填 “*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>需要授权的数据源名称，管理员级别下只支持填  * （代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>需要授权的表名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * <p>授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>需要授权的函数名，填 * 代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * <p>需要授权的视图，填 * 代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * <p>需要授权的列，填 * 代表当前所有列。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * <p>需要授权的数据引擎，填 * 代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * <p>用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReAuth")
    @Expose
    private Boolean ReAuth;

    /**
    * <p>权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>操作者，入参不填。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>权限创建的时间，入参不填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceId")
    @Expose
    private Long SourceId;

    /**
    * <p>权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>引擎类型</p>
    */
    @SerializedName("EngineGeneration")
    @Expose
    private String EngineGeneration;

    /**
    * <p>需要授权的Model名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>权限来源是否为管理员</p>
    */
    @SerializedName("IsAdminPolicy")
    @Expose
    private Boolean IsAdminPolicy;

    /**
    * <p>user和workgroup对应的确定性字符串PolicyId</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get <p>需要授权的数据库名，填 * 代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填 “*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。</p> 
     * @return Database <p>需要授权的数据库名，填 * 代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填 “*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>需要授权的数据库名，填 * 代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填 “*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。</p>
     * @param Database <p>需要授权的数据库名，填 * 代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填 “*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>需要授权的数据源名称，管理员级别下只支持填  * （代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。</p> 
     * @return Catalog <p>需要授权的数据源名称，管理员级别下只支持填  * （代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>需要授权的数据源名称，管理员级别下只支持填  * （代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。</p>
     * @param Catalog <p>需要授权的数据源名称，管理员级别下只支持填  * （代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>需要授权的表名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p> 
     * @return Table <p>需要授权的表名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set <p>需要授权的表名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
     * @param Table <p>需要授权的表名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get <p>授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。</p> 
     * @return Operation <p>授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。</p>
     * @param Operation <p>授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。</p> 
     * @return PolicyType <p>授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。</p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。</p>
     * @param PolicyType <p>授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。</p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>需要授权的函数名，填 * 代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Function <p>需要授权的函数名，填 * 代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set <p>需要授权的函数名，填 * 代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Function <p>需要授权的函数名，填 * 代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get <p>需要授权的视图，填 * 代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return View <p>需要授权的视图，填 * 代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set <p>需要授权的视图，填 * 代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param View <p>需要授权的视图，填 * 代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get <p>需要授权的列，填 * 代表当前所有列。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Column <p>需要授权的列，填 * 代表当前所有列。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * Set <p>需要授权的列，填 * 代表当前所有列。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Column <p>需要授权的列，填 * 代表当前所有列。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * Get <p>需要授权的数据引擎，填 * 代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngine <p>需要授权的数据引擎，填 * 代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set <p>需要授权的数据引擎，填 * 代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngine <p>需要授权的数据引擎，填 * 代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get <p>用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReAuth <p>用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReAuth() {
        return this.ReAuth;
    }

    /**
     * Set <p>用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReAuth <p>用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReAuth(Boolean ReAuth) {
        this.ReAuth = ReAuth;
    }

    /**
     * Get <p>权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source <p>权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source <p>权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode <p>授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode <p>授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>操作者，入参不填。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator <p>操作者，入参不填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者，入参不填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator <p>操作者，入参不填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>权限创建的时间，入参不填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>权限创建的时间，入参不填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>权限创建的时间，入参不填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>权限创建的时间，入参不填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceId <p>权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceId <p>权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceId(Long SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceName <p>权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceName <p>权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>引擎类型</p> 
     * @return EngineGeneration <p>引擎类型</p>
     */
    public String getEngineGeneration() {
        return this.EngineGeneration;
    }

    /**
     * Set <p>引擎类型</p>
     * @param EngineGeneration <p>引擎类型</p>
     */
    public void setEngineGeneration(String EngineGeneration) {
        this.EngineGeneration = EngineGeneration;
    }

    /**
     * Get <p>需要授权的Model名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p> 
     * @return Model <p>需要授权的Model名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>需要授权的Model名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
     * @param Model <p>需要授权的Model名，填 * 代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>权限来源是否为管理员</p> 
     * @return IsAdminPolicy <p>权限来源是否为管理员</p>
     */
    public Boolean getIsAdminPolicy() {
        return this.IsAdminPolicy;
    }

    /**
     * Set <p>权限来源是否为管理员</p>
     * @param IsAdminPolicy <p>权限来源是否为管理员</p>
     */
    public void setIsAdminPolicy(Boolean IsAdminPolicy) {
        this.IsAdminPolicy = IsAdminPolicy;
    }

    /**
     * Get <p>user和workgroup对应的确定性字符串PolicyId</p> 
     * @return PolicyId <p>user和workgroup对应的确定性字符串PolicyId</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>user和workgroup对应的确定性字符串PolicyId</p>
     * @param PolicyId <p>user和workgroup对应的确定性字符串PolicyId</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public Policy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policy(Policy source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.View != null) {
            this.View = new String(source.View);
        }
        if (source.Column != null) {
            this.Column = new String(source.Column);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.ReAuth != null) {
            this.ReAuth = new Boolean(source.ReAuth);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SourceId != null) {
            this.SourceId = new Long(source.SourceId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.EngineGeneration != null) {
            this.EngineGeneration = new String(source.EngineGeneration);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.IsAdminPolicy != null) {
            this.IsAdminPolicy = new Boolean(source.IsAdminPolicy);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "View", this.View);
        this.setParamSimple(map, prefix + "Column", this.Column);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "ReAuth", this.ReAuth);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "EngineGeneration", this.EngineGeneration);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "IsAdminPolicy", this.IsAdminPolicy);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

