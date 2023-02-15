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

public class PreviewDetail extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 域名套餐代码
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 域名套餐名称
    */
    @SerializedName("GradeTitle")
    @Expose
    private String GradeTitle;

    /**
    * 域名记录数
    */
    @SerializedName("Records")
    @Expose
    private Long Records;

    /**
    * 域名停靠状态。0 未开启 1 已开启 2 已暂停
    */
    @SerializedName("DomainParkingStatus")
    @Expose
    private Long DomainParkingStatus;

    /**
    * 自定义线路数量
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * 自定义线路分组数量
    */
    @SerializedName("LineGroupCount")
    @Expose
    private Long LineGroupCount;

    /**
    * 域名别名数量
    */
    @SerializedName("AliasCount")
    @Expose
    private Long AliasCount;

    /**
    * 允许添加的最大域名别名数量
    */
    @SerializedName("MaxAliasCount")
    @Expose
    private Long MaxAliasCount;

    /**
    * 昨天的解析量
    */
    @SerializedName("ResolveCount")
    @Expose
    private Long ResolveCount;

    /**
    * 增值服务数量
    */
    @SerializedName("VASCount")
    @Expose
    private Long VASCount;

    /**
     * Get 域名 
     * @return Name 域名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 域名
     * @param Name 域名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 域名套餐代码 
     * @return Grade 域名套餐代码
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 域名套餐代码
     * @param Grade 域名套餐代码
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 域名套餐名称 
     * @return GradeTitle 域名套餐名称
     */
    public String getGradeTitle() {
        return this.GradeTitle;
    }

    /**
     * Set 域名套餐名称
     * @param GradeTitle 域名套餐名称
     */
    public void setGradeTitle(String GradeTitle) {
        this.GradeTitle = GradeTitle;
    }

    /**
     * Get 域名记录数 
     * @return Records 域名记录数
     */
    public Long getRecords() {
        return this.Records;
    }

    /**
     * Set 域名记录数
     * @param Records 域名记录数
     */
    public void setRecords(Long Records) {
        this.Records = Records;
    }

    /**
     * Get 域名停靠状态。0 未开启 1 已开启 2 已暂停 
     * @return DomainParkingStatus 域名停靠状态。0 未开启 1 已开启 2 已暂停
     */
    public Long getDomainParkingStatus() {
        return this.DomainParkingStatus;
    }

    /**
     * Set 域名停靠状态。0 未开启 1 已开启 2 已暂停
     * @param DomainParkingStatus 域名停靠状态。0 未开启 1 已开启 2 已暂停
     */
    public void setDomainParkingStatus(Long DomainParkingStatus) {
        this.DomainParkingStatus = DomainParkingStatus;
    }

    /**
     * Get 自定义线路数量 
     * @return LineCount 自定义线路数量
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set 自定义线路数量
     * @param LineCount 自定义线路数量
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get 自定义线路分组数量 
     * @return LineGroupCount 自定义线路分组数量
     */
    public Long getLineGroupCount() {
        return this.LineGroupCount;
    }

    /**
     * Set 自定义线路分组数量
     * @param LineGroupCount 自定义线路分组数量
     */
    public void setLineGroupCount(Long LineGroupCount) {
        this.LineGroupCount = LineGroupCount;
    }

    /**
     * Get 域名别名数量 
     * @return AliasCount 域名别名数量
     */
    public Long getAliasCount() {
        return this.AliasCount;
    }

    /**
     * Set 域名别名数量
     * @param AliasCount 域名别名数量
     */
    public void setAliasCount(Long AliasCount) {
        this.AliasCount = AliasCount;
    }

    /**
     * Get 允许添加的最大域名别名数量 
     * @return MaxAliasCount 允许添加的最大域名别名数量
     */
    public Long getMaxAliasCount() {
        return this.MaxAliasCount;
    }

    /**
     * Set 允许添加的最大域名别名数量
     * @param MaxAliasCount 允许添加的最大域名别名数量
     */
    public void setMaxAliasCount(Long MaxAliasCount) {
        this.MaxAliasCount = MaxAliasCount;
    }

    /**
     * Get 昨天的解析量 
     * @return ResolveCount 昨天的解析量
     */
    public Long getResolveCount() {
        return this.ResolveCount;
    }

    /**
     * Set 昨天的解析量
     * @param ResolveCount 昨天的解析量
     */
    public void setResolveCount(Long ResolveCount) {
        this.ResolveCount = ResolveCount;
    }

    /**
     * Get 增值服务数量 
     * @return VASCount 增值服务数量
     */
    public Long getVASCount() {
        return this.VASCount;
    }

    /**
     * Set 增值服务数量
     * @param VASCount 增值服务数量
     */
    public void setVASCount(Long VASCount) {
        this.VASCount = VASCount;
    }

    public PreviewDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewDetail(PreviewDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.GradeTitle != null) {
            this.GradeTitle = new String(source.GradeTitle);
        }
        if (source.Records != null) {
            this.Records = new Long(source.Records);
        }
        if (source.DomainParkingStatus != null) {
            this.DomainParkingStatus = new Long(source.DomainParkingStatus);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.LineGroupCount != null) {
            this.LineGroupCount = new Long(source.LineGroupCount);
        }
        if (source.AliasCount != null) {
            this.AliasCount = new Long(source.AliasCount);
        }
        if (source.MaxAliasCount != null) {
            this.MaxAliasCount = new Long(source.MaxAliasCount);
        }
        if (source.ResolveCount != null) {
            this.ResolveCount = new Long(source.ResolveCount);
        }
        if (source.VASCount != null) {
            this.VASCount = new Long(source.VASCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "GradeTitle", this.GradeTitle);
        this.setParamSimple(map, prefix + "Records", this.Records);
        this.setParamSimple(map, prefix + "DomainParkingStatus", this.DomainParkingStatus);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "LineGroupCount", this.LineGroupCount);
        this.setParamSimple(map, prefix + "AliasCount", this.AliasCount);
        this.setParamSimple(map, prefix + "MaxAliasCount", this.MaxAliasCount);
        this.setParamSimple(map, prefix + "ResolveCount", this.ResolveCount);
        this.setParamSimple(map, prefix + "VASCount", this.VASCount);

    }
}

