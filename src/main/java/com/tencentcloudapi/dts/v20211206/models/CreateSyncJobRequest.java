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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSyncJobRequest extends AbstractModel{

    /**
    * 付款类型, 如：PrePay(表示包年包月)、PostPay(表示按时按量)
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 源端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * 源端数据库所在地域,如ap-guangzhou
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * 目标端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql,kafka等
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * 目标端数据库所在地域,如ap-guangzhou
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * 同步任务规格，Standard:标准版
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 一次购买的同步任务数量，取值范围为[1, 10]，默认为1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费，默认为此值）
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 同步链路规格，如micro,small,medium,large，默认为medium
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 同步任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 创建类似任务的现有任务Id
    */
    @SerializedName("ExistedJobId")
    @Expose
    private String ExistedJobId;

    /**
     * Get 付款类型, 如：PrePay(表示包年包月)、PostPay(表示按时按量) 
     * @return PayMode 付款类型, 如：PrePay(表示包年包月)、PostPay(表示按时按量)
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付款类型, 如：PrePay(表示包年包月)、PostPay(表示按时按量)
     * @param PayMode 付款类型, 如：PrePay(表示包年包月)、PostPay(表示按时按量)
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 源端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等 
     * @return SrcDatabaseType 源端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
     * @param SrcDatabaseType 源端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql等
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 源端数据库所在地域,如ap-guangzhou 
     * @return SrcRegion 源端数据库所在地域,如ap-guangzhou
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set 源端数据库所在地域,如ap-guangzhou
     * @param SrcRegion 源端数据库所在地域,如ap-guangzhou
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get 目标端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql,kafka等 
     * @return DstDatabaseType 目标端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql,kafka等
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 目标端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql,kafka等
     * @param DstDatabaseType 目标端数据库类型,如mysql,cynosdbmysql,tdapg,tdpg,tdsqlmysql,kafka等
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get 目标端数据库所在地域,如ap-guangzhou 
     * @return DstRegion 目标端数据库所在地域,如ap-guangzhou
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set 目标端数据库所在地域,如ap-guangzhou
     * @param DstRegion 目标端数据库所在地域,如ap-guangzhou
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get 同步任务规格，Standard:标准版 
     * @return Specification 同步任务规格，Standard:标准版
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 同步任务规格，Standard:标准版
     * @param Specification 同步任务规格，Standard:标准版
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 标签信息 
     * @return Tags 标签信息
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
     * @param Tags 标签信息
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 一次购买的同步任务数量，取值范围为[1, 10]，默认为1 
     * @return Count 一次购买的同步任务数量，取值范围为[1, 10]，默认为1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 一次购买的同步任务数量，取值范围为[1, 10]，默认为1
     * @param Count 一次购买的同步任务数量，取值范围为[1, 10]，默认为1
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费，默认为此值） 
     * @return AutoRenew 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费，默认为此值）
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费，默认为此值）
     * @param AutoRenew 自动续费标识，当PayMode值为PrePay则此项配置有意义，取值为：1（表示自动续费）、0（不自动续费，默认为此值）
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 同步链路规格，如micro,small,medium,large，默认为medium 
     * @return InstanceClass 同步链路规格，如micro,small,medium,large，默认为medium
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set 同步链路规格，如micro,small,medium,large，默认为medium
     * @param InstanceClass 同步链路规格，如micro,small,medium,large，默认为medium
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get 同步任务名称 
     * @return JobName 同步任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 同步任务名称
     * @param JobName 同步任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 创建类似任务的现有任务Id 
     * @return ExistedJobId 创建类似任务的现有任务Id
     */
    public String getExistedJobId() {
        return this.ExistedJobId;
    }

    /**
     * Set 创建类似任务的现有任务Id
     * @param ExistedJobId 创建类似任务的现有任务Id
     */
    public void setExistedJobId(String ExistedJobId) {
        this.ExistedJobId = ExistedJobId;
    }

    public CreateSyncJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSyncJobRequest(CreateSyncJobRequest source) {
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String(source.SrcDatabaseType);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String(source.DstDatabaseType);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.ExistedJobId != null) {
            this.ExistedJobId = new String(source.ExistedJobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "ExistedJobId", this.ExistedJobId);

    }
}

