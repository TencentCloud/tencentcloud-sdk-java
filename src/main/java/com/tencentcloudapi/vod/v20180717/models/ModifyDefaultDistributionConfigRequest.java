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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDefaultDistributionConfigRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 分发域名，取值为点播域名列表里的域名。不填或者填空，表示不修改域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 分发协议，取值为 HTTP 或者 HTTPS。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
    */
    @SerializedName("PlayKey")
    @Expose
    private String PlayKey;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 分发域名，取值为点播域名列表里的域名。不填或者填空，表示不修改域名。 
     * @return Domain 分发域名，取值为点播域名列表里的域名。不填或者填空，表示不修改域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 分发域名，取值为点播域名列表里的域名。不填或者填空，表示不修改域名。
     * @param Domain 分发域名，取值为点播域名列表里的域名。不填或者填空，表示不修改域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 分发协议，取值为 HTTP 或者 HTTPS。 
     * @return Scheme 分发协议，取值为 HTTP 或者 HTTPS。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 分发协议，取值为 HTTP 或者 HTTPS。
     * @param Scheme 分发协议，取值为 HTTP 或者 HTTPS。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。 
     * @return PlayKey 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
     */
    public String getPlayKey() {
        return this.PlayKey;
    }

    /**
     * Set 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
     * @param PlayKey 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
     */
    public void setPlayKey(String PlayKey) {
        this.PlayKey = PlayKey;
    }

    public ModifyDefaultDistributionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDefaultDistributionConfigRequest(ModifyDefaultDistributionConfigRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.PlayKey != null) {
            this.PlayKey = new String(source.PlayKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "PlayKey", this.PlayKey);

    }
}

