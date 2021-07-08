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

public class CopyProjectRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 被复制的项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 复制后的项目名称，不填为原项目名称+"(副本)"。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 复制后的项目归属者，不填为原项目归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

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
     * Get 被复制的项目 ID。 
     * @return ProjectId 被复制的项目 ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 被复制的项目 ID。
     * @param ProjectId 被复制的项目 ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 复制后的项目名称，不填为原项目名称+"(副本)"。 
     * @return Name 复制后的项目名称，不填为原项目名称+"(副本)"。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 复制后的项目名称，不填为原项目名称+"(副本)"。
     * @param Name 复制后的项目名称，不填为原项目名称+"(副本)"。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 复制后的项目归属者，不填为原项目归属者。 
     * @return Owner 复制后的项目归属者，不填为原项目归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 复制后的项目归属者，不填为原项目归属者。
     * @param Owner 复制后的项目归属者，不填为原项目归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
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

    public CopyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyProjectRequest(CopyProjectRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

