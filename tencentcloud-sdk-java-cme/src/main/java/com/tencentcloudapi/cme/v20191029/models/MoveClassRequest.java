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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveClassRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 源分类路径。
    */
    @SerializedName("SourceClassPath")
    @Expose
    private String SourceClassPath;

    /**
    * 目标分类路径。
    */
    @SerializedName("DestinationClassPath")
    @Expose
    private String DestinationClassPath;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 归属者。 
     * @return Owner 归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 归属者。
     * @param Owner 归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 源分类路径。 
     * @return SourceClassPath 源分类路径。
     */
    public String getSourceClassPath() {
        return this.SourceClassPath;
    }

    /**
     * Set 源分类路径。
     * @param SourceClassPath 源分类路径。
     */
    public void setSourceClassPath(String SourceClassPath) {
        this.SourceClassPath = SourceClassPath;
    }

    /**
     * Get 目标分类路径。 
     * @return DestinationClassPath 目标分类路径。
     */
    public String getDestinationClassPath() {
        return this.DestinationClassPath;
    }

    /**
     * Set 目标分类路径。
     * @param DestinationClassPath 目标分类路径。
     */
    public void setDestinationClassPath(String DestinationClassPath) {
        this.DestinationClassPath = DestinationClassPath;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验操作权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "SourceClassPath", this.SourceClassPath);
        this.setParamSimple(map, prefix + "DestinationClassPath", this.DestinationClassPath);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

