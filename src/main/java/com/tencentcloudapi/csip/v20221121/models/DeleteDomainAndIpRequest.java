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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainAndIpRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 资产
    */
    @SerializedName("Content")
    @Expose
    private PublicIpDomainListKey [] Content;

    /**
    * 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
    */
    @SerializedName("RetainPath")
    @Expose
    private Long RetainPath;

    /**
    * 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
    */
    @SerializedName("IgnoreAsset")
    @Expose
    private Long IgnoreAsset;

    /**
    * 资产标签
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * 删除类型，取值： ALL， 删除全部，将直接忽略Content的内容；                                           其他值 ,非全部，则Centent必填，  默认为其他值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 资产 
     * @return Content 资产
     */
    public PublicIpDomainListKey [] getContent() {
        return this.Content;
    }

    /**
     * Set 资产
     * @param Content 资产
     */
    public void setContent(PublicIpDomainListKey [] Content) {
        this.Content = Content;
    }

    /**
     * Get 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留 
     * @return RetainPath 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
     */
    public Long getRetainPath() {
        return this.RetainPath;
    }

    /**
     * Set 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
     * @param RetainPath 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
     */
    public void setRetainPath(Long RetainPath) {
        this.RetainPath = RetainPath;
    }

    /**
     * Get 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略 
     * @return IgnoreAsset 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
     */
    public Long getIgnoreAsset() {
        return this.IgnoreAsset;
    }

    /**
     * Set 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
     * @param IgnoreAsset 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
     */
    public void setIgnoreAsset(Long IgnoreAsset) {
        this.IgnoreAsset = IgnoreAsset;
    }

    /**
     * Get 资产标签 
     * @return Tags 资产标签
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资产标签
     * @param Tags 资产标签
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 删除类型，取值： ALL， 删除全部，将直接忽略Content的内容；                                           其他值 ,非全部，则Centent必填，  默认为其他值。 
     * @return Type 删除类型，取值： ALL， 删除全部，将直接忽略Content的内容；                                           其他值 ,非全部，则Centent必填，  默认为其他值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 删除类型，取值： ALL， 删除全部，将直接忽略Content的内容；                                           其他值 ,非全部，则Centent必填，  默认为其他值。
     * @param Type 删除类型，取值： ALL， 删除全部，将直接忽略Content的内容；                                           其他值 ,非全部，则Centent必填，  默认为其他值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DeleteDomainAndIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainAndIpRequest(DeleteDomainAndIpRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new PublicIpDomainListKey[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new PublicIpDomainListKey(source.Content[i]);
            }
        }
        if (source.RetainPath != null) {
            this.RetainPath = new Long(source.RetainPath);
        }
        if (source.IgnoreAsset != null) {
            this.IgnoreAsset = new Long(source.IgnoreAsset);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RetainPath", this.RetainPath);
        this.setParamSimple(map, prefix + "IgnoreAsset", this.IgnoreAsset);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

