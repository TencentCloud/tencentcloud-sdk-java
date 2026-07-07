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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisasterRecoverGroup extends AbstractModel {

    /**
    * <p>分散置放群组id。</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>分散置放群组名称，长度1-60个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分散置放群组类型，取值范围：<br></p><li>HOST：物理机<br></li><li>SW：交换机<br></li><li>RACK：机架</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>分散置放群组内最大容纳云服务器数量。</p>
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Long CvmQuotaTotal;

    /**
    * <p>分散置放群组内云服务器当前数量。</p>
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * <p>分散置放群组内，云服务器id列表。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>分散置放群组创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>置放群组亲和度</p>
    */
    @SerializedName("Affinity")
    @Expose
    private Long Affinity;

    /**
    * <p>置放群组类型，当前支持两种；分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组</p>
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * <p>分区置放群组的分区数量，如果是分区置放群组会返回(功能灰度中)</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>置放群组关联的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>分散置放群组id。</p> 
     * @return DisasterRecoverGroupId <p>分散置放群组id。</p>
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>分散置放群组id。</p>
     * @param DisasterRecoverGroupId <p>分散置放群组id。</p>
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>分散置放群组名称，长度1-60个字符。</p> 
     * @return Name <p>分散置放群组名称，长度1-60个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分散置放群组名称，长度1-60个字符。</p>
     * @param Name <p>分散置放群组名称，长度1-60个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分散置放群组类型，取值范围：<br></p><li>HOST：物理机<br></li><li>SW：交换机<br></li><li>RACK：机架</li> 
     * @return Type <p>分散置放群组类型，取值范围：<br></p><li>HOST：物理机<br></li><li>SW：交换机<br></li><li>RACK：机架</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>分散置放群组类型，取值范围：<br></p><li>HOST：物理机<br></li><li>SW：交换机<br></li><li>RACK：机架</li>
     * @param Type <p>分散置放群组类型，取值范围：<br></p><li>HOST：物理机<br></li><li>SW：交换机<br></li><li>RACK：机架</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>分散置放群组内最大容纳云服务器数量。</p> 
     * @return CvmQuotaTotal <p>分散置放群组内最大容纳云服务器数量。</p>
     */
    public Long getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set <p>分散置放群组内最大容纳云服务器数量。</p>
     * @param CvmQuotaTotal <p>分散置放群组内最大容纳云服务器数量。</p>
     */
    public void setCvmQuotaTotal(Long CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get <p>分散置放群组内云服务器当前数量。</p> 
     * @return CurrentNum <p>分散置放群组内云服务器当前数量。</p>
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set <p>分散置放群组内云服务器当前数量。</p>
     * @param CurrentNum <p>分散置放群组内云服务器当前数量。</p>
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get <p>分散置放群组内，云服务器id列表。</p> 
     * @return InstanceIds <p>分散置放群组内，云服务器id列表。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>分散置放群组内，云服务器id列表。</p>
     * @param InstanceIds <p>分散置放群组内，云服务器id列表。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>分散置放群组创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p> 
     * @return CreateTime <p>分散置放群组创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>分散置放群组创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     * @param CreateTime <p>分散置放群组创建时间。按照<code>ISO8601</code>标准表示，并且使用<code>UTC</code>时间。格式为：<code>YYYY-MM-DDThh:mm:ssZ</code>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>置放群组亲和度</p> 
     * @return Affinity <p>置放群组亲和度</p>
     */
    public Long getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>置放群组亲和度</p>
     * @param Affinity <p>置放群组亲和度</p>
     */
    public void setAffinity(Long Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get <p>置放群组类型，当前支持两种；分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组</p> 
     * @return Strategy <p>置放群组类型，当前支持两种；分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组</p>
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>置放群组类型，当前支持两种；分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组</p>
     * @param Strategy <p>置放群组类型，当前支持两种；分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组</p>
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>分区置放群组的分区数量，如果是分区置放群组会返回(功能灰度中)</p> 
     * @return PartitionCount <p>分区置放群组的分区数量，如果是分区置放群组会返回(功能灰度中)</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>分区置放群组的分区数量，如果是分区置放群组会返回(功能灰度中)</p>
     * @param PartitionCount <p>分区置放群组的分区数量，如果是分区置放群组会返回(功能灰度中)</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>置放群组关联的标签列表。</p> 
     * @return Tags <p>置放群组关联的标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>置放群组关联的标签列表。</p>
     * @param Tags <p>置放群组关联的标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public DisasterRecoverGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisasterRecoverGroup(DisasterRecoverGroup source) {
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CvmQuotaTotal != null) {
            this.CvmQuotaTotal = new Long(source.CvmQuotaTotal);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Affinity != null) {
            this.Affinity = new Long(source.Affinity);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Affinity", this.Affinity);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

