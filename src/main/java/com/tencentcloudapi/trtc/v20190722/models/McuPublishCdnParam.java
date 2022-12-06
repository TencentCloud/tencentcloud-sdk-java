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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuPublishCdnParam extends AbstractModel{

    /**
    * CDN转推URL。
    */
    @SerializedName("PublishCdnUrl")
    @Expose
    private String PublishCdnUrl;

    /**
    * 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。注意：为避免误产生转推费用，该参数建议明确填写。转推非腾讯云CDN时会产生转推费用，详情参见接口文档说明。
    */
    @SerializedName("IsTencentCdn")
    @Expose
    private Long IsTencentCdn;

    /**
     * Get CDN转推URL。 
     * @return PublishCdnUrl CDN转推URL。
     */
    public String getPublishCdnUrl() {
        return this.PublishCdnUrl;
    }

    /**
     * Set CDN转推URL。
     * @param PublishCdnUrl CDN转推URL。
     */
    public void setPublishCdnUrl(String PublishCdnUrl) {
        this.PublishCdnUrl = PublishCdnUrl;
    }

    /**
     * Get 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。注意：为避免误产生转推费用，该参数建议明确填写。转推非腾讯云CDN时会产生转推费用，详情参见接口文档说明。 
     * @return IsTencentCdn 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。注意：为避免误产生转推费用，该参数建议明确填写。转推非腾讯云CDN时会产生转推费用，详情参见接口文档说明。
     */
    public Long getIsTencentCdn() {
        return this.IsTencentCdn;
    }

    /**
     * Set 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。注意：为避免误产生转推费用，该参数建议明确填写。转推非腾讯云CDN时会产生转推费用，详情参见接口文档说明。
     * @param IsTencentCdn 是否是腾讯云CDN，0为转推非腾讯云CDN，1为转推腾讯CDN，不携带该参数默认为1。注意：为避免误产生转推费用，该参数建议明确填写。转推非腾讯云CDN时会产生转推费用，详情参见接口文档说明。
     */
    public void setIsTencentCdn(Long IsTencentCdn) {
        this.IsTencentCdn = IsTencentCdn;
    }

    public McuPublishCdnParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuPublishCdnParam(McuPublishCdnParam source) {
        if (source.PublishCdnUrl != null) {
            this.PublishCdnUrl = new String(source.PublishCdnUrl);
        }
        if (source.IsTencentCdn != null) {
            this.IsTencentCdn = new Long(source.IsTencentCdn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishCdnUrl", this.PublishCdnUrl);
        this.setParamSimple(map, prefix + "IsTencentCdn", this.IsTencentCdn);

    }
}

