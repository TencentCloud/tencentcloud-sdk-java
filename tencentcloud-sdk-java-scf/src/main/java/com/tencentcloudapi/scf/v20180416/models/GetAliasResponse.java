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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAliasResponse extends AbstractModel{

    /**
    * 别名指向的主版本
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * 别名的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 别名的路由信息
    */
    @SerializedName("RoutingConfig")
    @Expose
    private RoutingConfig RoutingConfig;

    /**
    * 别名的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 别名指向的主版本 
     * @return FunctionVersion 别名指向的主版本
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set 别名指向的主版本
     * @param FunctionVersion 别名指向的主版本
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get 别名的名称 
     * @return Name 别名的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 别名的名称
     * @param Name 别名的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 别名的路由信息 
     * @return RoutingConfig 别名的路由信息
     */
    public RoutingConfig getRoutingConfig() {
        return this.RoutingConfig;
    }

    /**
     * Set 别名的路由信息
     * @param RoutingConfig 别名的路由信息
     */
    public void setRoutingConfig(RoutingConfig RoutingConfig) {
        this.RoutingConfig = RoutingConfig;
    }

    /**
     * Get 别名的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 别名的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 别名的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 别名的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "RoutingConfig.", this.RoutingConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

