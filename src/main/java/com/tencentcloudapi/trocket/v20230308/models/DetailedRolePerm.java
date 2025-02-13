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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailedRolePerm extends AbstractModel {

    /**
    * 权限对应的资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 是否开启生产权限
    */
    @SerializedName("PermWrite")
    @Expose
    private Boolean PermWrite;

    /**
    * 是否开启消费权限
    */
    @SerializedName("PermRead")
    @Expose
    private Boolean PermRead;

    /**
    * 授权资源类型（Topic:主题; Group:消费组）
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 权限对应的资源 
     * @return Resource 权限对应的资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 权限对应的资源
     * @param Resource 权限对应的资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 是否开启生产权限 
     * @return PermWrite 是否开启生产权限
     */
    public Boolean getPermWrite() {
        return this.PermWrite;
    }

    /**
     * Set 是否开启生产权限
     * @param PermWrite 是否开启生产权限
     */
    public void setPermWrite(Boolean PermWrite) {
        this.PermWrite = PermWrite;
    }

    /**
     * Get 是否开启消费权限 
     * @return PermRead 是否开启消费权限
     */
    public Boolean getPermRead() {
        return this.PermRead;
    }

    /**
     * Set 是否开启消费权限
     * @param PermRead 是否开启消费权限
     */
    public void setPermRead(Boolean PermRead) {
        this.PermRead = PermRead;
    }

    /**
     * Get 授权资源类型（Topic:主题; Group:消费组） 
     * @return ResourceType 授权资源类型（Topic:主题; Group:消费组）
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 授权资源类型（Topic:主题; Group:消费组）
     * @param ResourceType 授权资源类型（Topic:主题; Group:消费组）
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源备注 
     * @return Remark 资源备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 资源备注
     * @param Remark 资源备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public DetailedRolePerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailedRolePerm(DetailedRolePerm source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.PermWrite != null) {
            this.PermWrite = new Boolean(source.PermWrite);
        }
        if (source.PermRead != null) {
            this.PermRead = new Boolean(source.PermRead);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "PermWrite", this.PermWrite);
        this.setParamSimple(map, prefix + "PermRead", this.PermRead);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

