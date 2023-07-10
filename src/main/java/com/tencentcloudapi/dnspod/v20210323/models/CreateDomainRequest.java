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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名分组ID。可以通过接口DescribeDomainGroupList查看当前域名分组信息
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 是否星标域名，”yes”、”no” 分别代表是和否。
    */
    @SerializedName("IsMark")
    @Expose
    private String IsMark;

    /**
    * 添加子域名时，是否迁移相关父域名的解析记录。不传默认为 true
    */
    @SerializedName("TransferSubDomain")
    @Expose
    private Boolean TransferSubDomain;

    /**
    * 域名绑定的标签
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

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
     * Get 域名分组ID。可以通过接口DescribeDomainGroupList查看当前域名分组信息 
     * @return GroupId 域名分组ID。可以通过接口DescribeDomainGroupList查看当前域名分组信息
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 域名分组ID。可以通过接口DescribeDomainGroupList查看当前域名分组信息
     * @param GroupId 域名分组ID。可以通过接口DescribeDomainGroupList查看当前域名分组信息
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 是否星标域名，”yes”、”no” 分别代表是和否。 
     * @return IsMark 是否星标域名，”yes”、”no” 分别代表是和否。
     */
    public String getIsMark() {
        return this.IsMark;
    }

    /**
     * Set 是否星标域名，”yes”、”no” 分别代表是和否。
     * @param IsMark 是否星标域名，”yes”、”no” 分别代表是和否。
     */
    public void setIsMark(String IsMark) {
        this.IsMark = IsMark;
    }

    /**
     * Get 添加子域名时，是否迁移相关父域名的解析记录。不传默认为 true 
     * @return TransferSubDomain 添加子域名时，是否迁移相关父域名的解析记录。不传默认为 true
     */
    public Boolean getTransferSubDomain() {
        return this.TransferSubDomain;
    }

    /**
     * Set 添加子域名时，是否迁移相关父域名的解析记录。不传默认为 true
     * @param TransferSubDomain 添加子域名时，是否迁移相关父域名的解析记录。不传默认为 true
     */
    public void setTransferSubDomain(Boolean TransferSubDomain) {
        this.TransferSubDomain = TransferSubDomain;
    }

    /**
     * Get 域名绑定的标签 
     * @return Tags 域名绑定的标签
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 域名绑定的标签
     * @param Tags 域名绑定的标签
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    public CreateDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainRequest(CreateDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.IsMark != null) {
            this.IsMark = new String(source.IsMark);
        }
        if (source.TransferSubDomain != null) {
            this.TransferSubDomain = new Boolean(source.TransferSubDomain);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "IsMark", this.IsMark);
        this.setParamSimple(map, prefix + "TransferSubDomain", this.TransferSubDomain);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

