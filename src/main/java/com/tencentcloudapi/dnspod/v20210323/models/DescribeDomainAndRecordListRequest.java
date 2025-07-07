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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainAndRecordListRequest extends AbstractModel {

    /**
    * 搜索所有域名。AllDomain、GroupIdList、DomainList、DomainIdList 参数传任一个即可。优先级为：AllDomain > GroupIdList  > DomainList > DomainIdList。
    */
    @SerializedName("AllDomain")
    @Expose
    private String AllDomain;

    /**
    * 要搜索的域名列表。
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 要搜索的域名 ID 列表。
    */
    @SerializedName("DomainIdList")
    @Expose
    private Long [] DomainIdList;

    /**
    * 要搜索的域名分组 ID 列表。
    */
    @SerializedName("GroupIdList")
    @Expose
    private Long [] GroupIdList;

    /**
    * 记录类型筛选
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 子域名筛选
    */
    @SerializedName("SubKeyword")
    @Expose
    private String SubKeyword;

    /**
    * 记录值筛选
    */
    @SerializedName("ValueKeyword")
    @Expose
    private String ValueKeyword;

    /**
    * 线路筛选
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 备注筛选
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 记录状态筛选
1：正常
0：暂停

    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get 搜索所有域名。AllDomain、GroupIdList、DomainList、DomainIdList 参数传任一个即可。优先级为：AllDomain > GroupIdList  > DomainList > DomainIdList。 
     * @return AllDomain 搜索所有域名。AllDomain、GroupIdList、DomainList、DomainIdList 参数传任一个即可。优先级为：AllDomain > GroupIdList  > DomainList > DomainIdList。
     */
    public String getAllDomain() {
        return this.AllDomain;
    }

    /**
     * Set 搜索所有域名。AllDomain、GroupIdList、DomainList、DomainIdList 参数传任一个即可。优先级为：AllDomain > GroupIdList  > DomainList > DomainIdList。
     * @param AllDomain 搜索所有域名。AllDomain、GroupIdList、DomainList、DomainIdList 参数传任一个即可。优先级为：AllDomain > GroupIdList  > DomainList > DomainIdList。
     */
    public void setAllDomain(String AllDomain) {
        this.AllDomain = AllDomain;
    }

    /**
     * Get 要搜索的域名列表。 
     * @return DomainList 要搜索的域名列表。
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 要搜索的域名列表。
     * @param DomainList 要搜索的域名列表。
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 要搜索的域名 ID 列表。 
     * @return DomainIdList 要搜索的域名 ID 列表。
     */
    public Long [] getDomainIdList() {
        return this.DomainIdList;
    }

    /**
     * Set 要搜索的域名 ID 列表。
     * @param DomainIdList 要搜索的域名 ID 列表。
     */
    public void setDomainIdList(Long [] DomainIdList) {
        this.DomainIdList = DomainIdList;
    }

    /**
     * Get 要搜索的域名分组 ID 列表。 
     * @return GroupIdList 要搜索的域名分组 ID 列表。
     */
    public Long [] getGroupIdList() {
        return this.GroupIdList;
    }

    /**
     * Set 要搜索的域名分组 ID 列表。
     * @param GroupIdList 要搜索的域名分组 ID 列表。
     */
    public void setGroupIdList(Long [] GroupIdList) {
        this.GroupIdList = GroupIdList;
    }

    /**
     * Get 记录类型筛选 
     * @return RecordType 记录类型筛选
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型筛选
     * @param RecordType 记录类型筛选
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 子域名筛选 
     * @return SubKeyword 子域名筛选
     */
    public String getSubKeyword() {
        return this.SubKeyword;
    }

    /**
     * Set 子域名筛选
     * @param SubKeyword 子域名筛选
     */
    public void setSubKeyword(String SubKeyword) {
        this.SubKeyword = SubKeyword;
    }

    /**
     * Get 记录值筛选 
     * @return ValueKeyword 记录值筛选
     */
    public String getValueKeyword() {
        return this.ValueKeyword;
    }

    /**
     * Set 记录值筛选
     * @param ValueKeyword 记录值筛选
     */
    public void setValueKeyword(String ValueKeyword) {
        this.ValueKeyword = ValueKeyword;
    }

    /**
     * Get 线路筛选 
     * @return Area 线路筛选
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 线路筛选
     * @param Area 线路筛选
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 备注筛选 
     * @return Remark 备注筛选
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注筛选
     * @param Remark 备注筛选
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 记录状态筛选
1：正常
0：暂停
 
     * @return Enabled 记录状态筛选
1：正常
0：暂停

     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 记录状态筛选
1：正常
0：暂停

     * @param Enabled 记录状态筛选
1：正常
0：暂停

     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public DescribeDomainAndRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainAndRecordListRequest(DescribeDomainAndRecordListRequest source) {
        if (source.AllDomain != null) {
            this.AllDomain = new String(source.AllDomain);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.DomainIdList != null) {
            this.DomainIdList = new Long[source.DomainIdList.length];
            for (int i = 0; i < source.DomainIdList.length; i++) {
                this.DomainIdList[i] = new Long(source.DomainIdList[i]);
            }
        }
        if (source.GroupIdList != null) {
            this.GroupIdList = new Long[source.GroupIdList.length];
            for (int i = 0; i < source.GroupIdList.length; i++) {
                this.GroupIdList[i] = new Long(source.GroupIdList[i]);
            }
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.SubKeyword != null) {
            this.SubKeyword = new String(source.SubKeyword);
        }
        if (source.ValueKeyword != null) {
            this.ValueKeyword = new String(source.ValueKeyword);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllDomain", this.AllDomain);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamArraySimple(map, prefix + "DomainIdList.", this.DomainIdList);
        this.setParamArraySimple(map, prefix + "GroupIdList.", this.GroupIdList);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "SubKeyword", this.SubKeyword);
        this.setParamSimple(map, prefix + "ValueKeyword", this.ValueKeyword);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

