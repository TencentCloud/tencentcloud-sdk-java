/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policy extends AbstractModel{

    /**
    * 需要授权的数据库名，填*代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 需要授权的数据源名称，管理员级别下只支持填*（代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 需要授权的表名，填*代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 需要授权的函数名，填*代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * 需要授权的视图，填*代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("View")
    @Expose
    private String View;

    /**
    * 需要授权的列，填*代表当前所有列。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * 需要授权的数据引擎，填*代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * 用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReAuth")
    @Expose
    private Boolean ReAuth;

    /**
    * 权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 操作者，入参不填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 权限创建的时间，入参不填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceId")
    @Expose
    private Long SourceId;

    /**
    * 权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
     * Get 需要授权的数据库名，填*代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。 
     * @return Database 需要授权的数据库名，填*代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 需要授权的数据库名，填*代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。
     * @param Database 需要授权的数据库名，填*代表当前Catalog下所有数据库。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定数据库。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 需要授权的数据源名称，管理员级别下只支持填*（代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。 
     * @return Catalog 需要授权的数据源名称，管理员级别下只支持填*（代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 需要授权的数据源名称，管理员级别下只支持填*（代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。
     * @param Catalog 需要授权的数据源名称，管理员级别下只支持填*（代表该级别全部资源）；数据源级别和数据库级别鉴权的情况下，只支持填COSDataCatalog或者*；在数据表级别鉴权下可以填写用户自定义数据源。不填情况下默认为DataLakeCatalog。注意：如果是对用户自定义数据源进行鉴权，DLC能够管理的权限是用户接入数据源的时候提供的账户的子集。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 需要授权的表名，填*代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。 
     * @return Table 需要授权的表名，填*代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 需要授权的表名，填*代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。
     * @param Table 需要授权的表名，填*代表当前Database下所有表。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定数据表。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。 
     * @return Operation 授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。
     * @param Operation 授权的权限操作，对于不同级别的鉴权提供不同操作。管理员权限：ALL，不填默认为ALL；数据连接级鉴权：CREATE；数据库级别鉴权：ALL、CREATE、ALTER、DROP；数据表权限：ALL、SELECT、INSERT、ALTER、DELETE、DROP、UPDATE。注意：在数据表权限下，指定的数据源不为COSDataCatalog的时候，只支持SELECT操作。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。 
     * @return PolicyType 授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。
     * @param PolicyType 授权类型，现在支持八种授权类型：ADMIN:管理员级别鉴权 DATASOURCE：数据连接级别鉴权 DATABASE：数据库级别鉴权 TABLE：表级别鉴权 VIEW：视图级别鉴权 FUNCTION：函数级别鉴权 COLUMN：列级别鉴权 ENGINE：数据引擎鉴权。不填默认为管理员级别鉴权。
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 需要授权的函数名，填*代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Function 需要授权的函数名，填*代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set 需要授权的函数名，填*代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Function 需要授权的函数名，填*代表当前Catalog下所有函数。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别时只允许填空，其他类型下可以任意指定函数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get 需要授权的视图，填*代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return View 需要授权的视图，填*代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getView() {
        return this.View;
    }

    /**
     * Set 需要授权的视图，填*代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。
注意：此字段可能返回 null，表示取不到有效值。
     * @param View 需要授权的视图，填*代表当前Database下所有视图。当授权类型为管理员级别时，只允许填“*”，当授权类型为数据连接级别、数据库级别时只允许填空，其他类型下可以任意指定视图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setView(String View) {
        this.View = View;
    }

    /**
     * Get 需要授权的列，填*代表当前所有列。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Column 需要授权的列，填*代表当前所有列。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * Set 需要授权的列，填*代表当前所有列。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Column 需要授权的列，填*代表当前所有列。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * Get 需要授权的数据引擎，填*代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngine 需要授权的数据引擎，填*代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set 需要授权的数据引擎，填*代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngine 需要授权的数据引擎，填*代表当前所有引擎。当授权类型为管理员级别时，只允许填“*”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get 用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReAuth 用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReAuth() {
        return this.ReAuth;
    }

    /**
     * Set 用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReAuth 用户是否可以进行二次授权。当为true的时候，被授权的用户可以将本次获取的权限再次授权给其他子用户。默认为false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReAuth(Boolean ReAuth) {
        this.ReAuth = ReAuth;
    }

    /**
     * Get 权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 权限来源，入参不填。USER：权限来自用户本身；WORKGROUP：权限来自绑定的工作组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 授权模式，入参不填。COMMON：普通模式；SENIOR：高级模式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 操作者，入参不填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作者，入参不填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者，入参不填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作者，入参不填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 权限创建的时间，入参不填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 权限创建的时间，入参不填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 权限创建的时间，入参不填
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 权限创建的时间，入参不填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceId 权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceId 权限所属工作组的ID，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceId(Long SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceName 权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceName 权限所属工作组的名称，只有当该权限的来源为工作组时才会有值。即仅当Source字段的值为WORKGROUP时该字段才有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
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

    }
}

