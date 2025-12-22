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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudRunVersionsRequest extends AbstractModel {

    /**
    * 环境 Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 是否删除服务，只有最后一个版本的时候才生效
    */
    @SerializedName("IsDeleteServer")
    @Expose
    private Boolean IsDeleteServer;

    /**
    * 只有删除服务的时候，才生效
    */
    @SerializedName("IsDeleteImage")
    @Expose
    private Boolean IsDeleteImage;

    /**
    * 删除版本的信息
    */
    @SerializedName("SimpleVersions")
    @Expose
    private SimpleVersion [] SimpleVersions;

    /**
    * 操作备注
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
     * Get 环境 Id 
     * @return EnvId 环境 Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 Id
     * @param EnvId 环境 Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 是否删除服务，只有最后一个版本的时候才生效 
     * @return IsDeleteServer 是否删除服务，只有最后一个版本的时候才生效
     */
    public Boolean getIsDeleteServer() {
        return this.IsDeleteServer;
    }

    /**
     * Set 是否删除服务，只有最后一个版本的时候才生效
     * @param IsDeleteServer 是否删除服务，只有最后一个版本的时候才生效
     */
    public void setIsDeleteServer(Boolean IsDeleteServer) {
        this.IsDeleteServer = IsDeleteServer;
    }

    /**
     * Get 只有删除服务的时候，才生效 
     * @return IsDeleteImage 只有删除服务的时候，才生效
     */
    public Boolean getIsDeleteImage() {
        return this.IsDeleteImage;
    }

    /**
     * Set 只有删除服务的时候，才生效
     * @param IsDeleteImage 只有删除服务的时候，才生效
     */
    public void setIsDeleteImage(Boolean IsDeleteImage) {
        this.IsDeleteImage = IsDeleteImage;
    }

    /**
     * Get 删除版本的信息 
     * @return SimpleVersions 删除版本的信息
     */
    public SimpleVersion [] getSimpleVersions() {
        return this.SimpleVersions;
    }

    /**
     * Set 删除版本的信息
     * @param SimpleVersions 删除版本的信息
     */
    public void setSimpleVersions(SimpleVersion [] SimpleVersions) {
        this.SimpleVersions = SimpleVersions;
    }

    /**
     * Get 操作备注 
     * @return OperatorRemark 操作备注
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作备注
     * @param OperatorRemark 操作备注
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    public DeleteCloudRunVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudRunVersionsRequest(DeleteCloudRunVersionsRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.IsDeleteServer != null) {
            this.IsDeleteServer = new Boolean(source.IsDeleteServer);
        }
        if (source.IsDeleteImage != null) {
            this.IsDeleteImage = new Boolean(source.IsDeleteImage);
        }
        if (source.SimpleVersions != null) {
            this.SimpleVersions = new SimpleVersion[source.SimpleVersions.length];
            for (int i = 0; i < source.SimpleVersions.length; i++) {
                this.SimpleVersions[i] = new SimpleVersion(source.SimpleVersions[i]);
            }
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "IsDeleteServer", this.IsDeleteServer);
        this.setParamSimple(map, prefix + "IsDeleteImage", this.IsDeleteImage);
        this.setParamArrayObj(map, prefix + "SimpleVersions.", this.SimpleVersions);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);

    }
}

