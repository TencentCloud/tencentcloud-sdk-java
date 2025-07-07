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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetDescription extends AbstractModel {

    /**
    * QCS资源六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)；scf资源六段式示例[qcs::scf:ap-guangzhou:uin/123:namespace/test(函数命名空间)/function/test(函数名)/$LATEST(函数版本)] amp资源六段式示例[qcs::eb-amp:ap-guangzhou:uin/123:] ckafka资源六段式示例[qcs::ckafka:ap-guangzhou:uin/123:ckafkaId/uin/123/ckafka-123(ckafka实例Id)] cls资源六段式示例[qcs::cls:ap-guangzhou:uin/123:topic/122332442(topicId)] es资源六段式示例[qcs::es:ap-guangzhou:appid/123/uin/456:instance/es-7cplmhsd(es实例Id)]
    */
    @SerializedName("ResourceDescription")
    @Expose
    private String ResourceDescription;

    /**
    * 云函数参数
    */
    @SerializedName("SCFParams")
    @Expose
    private SCFParams SCFParams;

    /**
    * Ckafka参数
    */
    @SerializedName("CkafkaTargetParams")
    @Expose
    private CkafkaTargetParams CkafkaTargetParams;

    /**
    * ElasticSearch参数
    */
    @SerializedName("ESTargetParams")
    @Expose
    private ESTargetParams ESTargetParams;

    /**
     * Get QCS资源六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)；scf资源六段式示例[qcs::scf:ap-guangzhou:uin/123:namespace/test(函数命名空间)/function/test(函数名)/$LATEST(函数版本)] amp资源六段式示例[qcs::eb-amp:ap-guangzhou:uin/123:] ckafka资源六段式示例[qcs::ckafka:ap-guangzhou:uin/123:ckafkaId/uin/123/ckafka-123(ckafka实例Id)] cls资源六段式示例[qcs::cls:ap-guangzhou:uin/123:topic/122332442(topicId)] es资源六段式示例[qcs::es:ap-guangzhou:appid/123/uin/456:instance/es-7cplmhsd(es实例Id)] 
     * @return ResourceDescription QCS资源六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)；scf资源六段式示例[qcs::scf:ap-guangzhou:uin/123:namespace/test(函数命名空间)/function/test(函数名)/$LATEST(函数版本)] amp资源六段式示例[qcs::eb-amp:ap-guangzhou:uin/123:] ckafka资源六段式示例[qcs::ckafka:ap-guangzhou:uin/123:ckafkaId/uin/123/ckafka-123(ckafka实例Id)] cls资源六段式示例[qcs::cls:ap-guangzhou:uin/123:topic/122332442(topicId)] es资源六段式示例[qcs::es:ap-guangzhou:appid/123/uin/456:instance/es-7cplmhsd(es实例Id)]
     */
    public String getResourceDescription() {
        return this.ResourceDescription;
    }

    /**
     * Set QCS资源六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)；scf资源六段式示例[qcs::scf:ap-guangzhou:uin/123:namespace/test(函数命名空间)/function/test(函数名)/$LATEST(函数版本)] amp资源六段式示例[qcs::eb-amp:ap-guangzhou:uin/123:] ckafka资源六段式示例[qcs::ckafka:ap-guangzhou:uin/123:ckafkaId/uin/123/ckafka-123(ckafka实例Id)] cls资源六段式示例[qcs::cls:ap-guangzhou:uin/123:topic/122332442(topicId)] es资源六段式示例[qcs::es:ap-guangzhou:appid/123/uin/456:instance/es-7cplmhsd(es实例Id)]
     * @param ResourceDescription QCS资源六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)；scf资源六段式示例[qcs::scf:ap-guangzhou:uin/123:namespace/test(函数命名空间)/function/test(函数名)/$LATEST(函数版本)] amp资源六段式示例[qcs::eb-amp:ap-guangzhou:uin/123:] ckafka资源六段式示例[qcs::ckafka:ap-guangzhou:uin/123:ckafkaId/uin/123/ckafka-123(ckafka实例Id)] cls资源六段式示例[qcs::cls:ap-guangzhou:uin/123:topic/122332442(topicId)] es资源六段式示例[qcs::es:ap-guangzhou:appid/123/uin/456:instance/es-7cplmhsd(es实例Id)]
     */
    public void setResourceDescription(String ResourceDescription) {
        this.ResourceDescription = ResourceDescription;
    }

    /**
     * Get 云函数参数 
     * @return SCFParams 云函数参数
     */
    public SCFParams getSCFParams() {
        return this.SCFParams;
    }

    /**
     * Set 云函数参数
     * @param SCFParams 云函数参数
     */
    public void setSCFParams(SCFParams SCFParams) {
        this.SCFParams = SCFParams;
    }

    /**
     * Get Ckafka参数 
     * @return CkafkaTargetParams Ckafka参数
     */
    public CkafkaTargetParams getCkafkaTargetParams() {
        return this.CkafkaTargetParams;
    }

    /**
     * Set Ckafka参数
     * @param CkafkaTargetParams Ckafka参数
     */
    public void setCkafkaTargetParams(CkafkaTargetParams CkafkaTargetParams) {
        this.CkafkaTargetParams = CkafkaTargetParams;
    }

    /**
     * Get ElasticSearch参数 
     * @return ESTargetParams ElasticSearch参数
     */
    public ESTargetParams getESTargetParams() {
        return this.ESTargetParams;
    }

    /**
     * Set ElasticSearch参数
     * @param ESTargetParams ElasticSearch参数
     */
    public void setESTargetParams(ESTargetParams ESTargetParams) {
        this.ESTargetParams = ESTargetParams;
    }

    public TargetDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetDescription(TargetDescription source) {
        if (source.ResourceDescription != null) {
            this.ResourceDescription = new String(source.ResourceDescription);
        }
        if (source.SCFParams != null) {
            this.SCFParams = new SCFParams(source.SCFParams);
        }
        if (source.CkafkaTargetParams != null) {
            this.CkafkaTargetParams = new CkafkaTargetParams(source.CkafkaTargetParams);
        }
        if (source.ESTargetParams != null) {
            this.ESTargetParams = new ESTargetParams(source.ESTargetParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceDescription", this.ResourceDescription);
        this.setParamObj(map, prefix + "SCFParams.", this.SCFParams);
        this.setParamObj(map, prefix + "CkafkaTargetParams.", this.CkafkaTargetParams);
        this.setParamObj(map, prefix + "ESTargetParams.", this.ESTargetParams);

    }
}

