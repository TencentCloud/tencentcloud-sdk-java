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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Runtime extends AbstractModel{

    /**
    * 运行环境名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行环境框架
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * 运行环境描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否为公开运行环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Public")
    @Expose
    private Boolean Public;

    /**
    * 是否打开健康检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckOn")
    @Expose
    private Boolean HealthCheckOn;

    /**
    * 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 运行环境名称 
     * @return Name 运行环境名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 运行环境名称
     * @param Name 运行环境名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 运行环境框架 
     * @return Framework 运行环境框架
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set 运行环境框架
     * @param Framework 运行环境框架
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get 运行环境描述 
     * @return Description 运行环境描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 运行环境描述
     * @param Description 运行环境描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否为公开运行环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Public 是否为公开运行环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPublic() {
        return this.Public;
    }

    /**
     * Set 是否为公开运行环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param Public 是否为公开运行环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    /**
     * Get 是否打开健康检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckOn 是否打开健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHealthCheckOn() {
        return this.HealthCheckOn;
    }

    /**
     * Set 是否打开健康检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckOn 是否打开健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckOn(Boolean HealthCheckOn) {
        this.HealthCheckOn = HealthCheckOn;
    }

    /**
     * Get 镜像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "HealthCheckOn", this.HealthCheckOn);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

