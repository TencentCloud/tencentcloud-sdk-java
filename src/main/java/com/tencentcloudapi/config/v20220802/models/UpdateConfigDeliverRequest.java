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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateConfigDeliverRequest extends AbstractModel {

    /**
    * 0 关闭  1 开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 投递服务名称
    */
    @SerializedName("DeliverName")
    @Expose
    private String DeliverName;

    /**
    * 资源六段式  
COS：qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
    */
    @SerializedName("TargetArn")
    @Expose
    private String TargetArn;

    /**
    * clonfig_fix
    */
    @SerializedName("DeliverPrefix")
    @Expose
    private String DeliverPrefix;

    /**
    * 投递类型
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * 1：配置变更 2： 资源列表 3：全选
    */
    @SerializedName("DeliverContentType")
    @Expose
    private Long DeliverContentType;

    /**
     * Get 0 关闭  1 开启 
     * @return Status 0 关闭  1 开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 关闭  1 开启
     * @param Status 0 关闭  1 开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 投递服务名称 
     * @return DeliverName 投递服务名称
     */
    public String getDeliverName() {
        return this.DeliverName;
    }

    /**
     * Set 投递服务名称
     * @param DeliverName 投递服务名称
     */
    public void setDeliverName(String DeliverName) {
        this.DeliverName = DeliverName;
    }

    /**
     * Get 资源六段式  
COS：qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId 
     * @return TargetArn 资源六段式  
COS：qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
     */
    public String getTargetArn() {
        return this.TargetArn;
    }

    /**
     * Set 资源六段式  
COS：qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
     * @param TargetArn 资源六段式  
COS：qcs::cos:$region:$account:prefix/$appid/$BucketName
CLS:
qcs::cls:$region:$account:cls/topicId
     */
    public void setTargetArn(String TargetArn) {
        this.TargetArn = TargetArn;
    }

    /**
     * Get clonfig_fix 
     * @return DeliverPrefix clonfig_fix
     */
    public String getDeliverPrefix() {
        return this.DeliverPrefix;
    }

    /**
     * Set clonfig_fix
     * @param DeliverPrefix clonfig_fix
     */
    public void setDeliverPrefix(String DeliverPrefix) {
        this.DeliverPrefix = DeliverPrefix;
    }

    /**
     * Get 投递类型 
     * @return DeliverType 投递类型
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set 投递类型
     * @param DeliverType 投递类型
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get 1：配置变更 2： 资源列表 3：全选 
     * @return DeliverContentType 1：配置变更 2： 资源列表 3：全选
     */
    public Long getDeliverContentType() {
        return this.DeliverContentType;
    }

    /**
     * Set 1：配置变更 2： 资源列表 3：全选
     * @param DeliverContentType 1：配置变更 2： 资源列表 3：全选
     */
    public void setDeliverContentType(Long DeliverContentType) {
        this.DeliverContentType = DeliverContentType;
    }

    public UpdateConfigDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateConfigDeliverRequest(UpdateConfigDeliverRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DeliverName != null) {
            this.DeliverName = new String(source.DeliverName);
        }
        if (source.TargetArn != null) {
            this.TargetArn = new String(source.TargetArn);
        }
        if (source.DeliverPrefix != null) {
            this.DeliverPrefix = new String(source.DeliverPrefix);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new String(source.DeliverType);
        }
        if (source.DeliverContentType != null) {
            this.DeliverContentType = new Long(source.DeliverContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeliverName", this.DeliverName);
        this.setParamSimple(map, prefix + "TargetArn", this.TargetArn);
        this.setParamSimple(map, prefix + "DeliverPrefix", this.DeliverPrefix);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "DeliverContentType", this.DeliverContentType);

    }
}

