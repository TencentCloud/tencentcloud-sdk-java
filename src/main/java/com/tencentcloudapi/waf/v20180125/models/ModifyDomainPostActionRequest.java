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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainPostActionRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 0-关闭投递，1-开启投递
    */
    @SerializedName("PostCLSAction")
    @Expose
    private Long PostCLSAction;

    /**
    * 0-关闭投递，1-开启投递
    */
    @SerializedName("PostCKafkaAction")
    @Expose
    private Long PostCKafkaAction;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 0-关闭投递，1-开启投递 
     * @return PostCLSAction 0-关闭投递，1-开启投递
     */
    public Long getPostCLSAction() {
        return this.PostCLSAction;
    }

    /**
     * Set 0-关闭投递，1-开启投递
     * @param PostCLSAction 0-关闭投递，1-开启投递
     */
    public void setPostCLSAction(Long PostCLSAction) {
        this.PostCLSAction = PostCLSAction;
    }

    /**
     * Get 0-关闭投递，1-开启投递 
     * @return PostCKafkaAction 0-关闭投递，1-开启投递
     */
    public Long getPostCKafkaAction() {
        return this.PostCKafkaAction;
    }

    /**
     * Set 0-关闭投递，1-开启投递
     * @param PostCKafkaAction 0-关闭投递，1-开启投递
     */
    public void setPostCKafkaAction(Long PostCKafkaAction) {
        this.PostCKafkaAction = PostCKafkaAction;
    }

    public ModifyDomainPostActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainPostActionRequest(ModifyDomainPostActionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.PostCLSAction != null) {
            this.PostCLSAction = new Long(source.PostCLSAction);
        }
        if (source.PostCKafkaAction != null) {
            this.PostCKafkaAction = new Long(source.PostCKafkaAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "PostCLSAction", this.PostCLSAction);
        this.setParamSimple(map, prefix + "PostCKafkaAction", this.PostCKafkaAction);

    }
}

