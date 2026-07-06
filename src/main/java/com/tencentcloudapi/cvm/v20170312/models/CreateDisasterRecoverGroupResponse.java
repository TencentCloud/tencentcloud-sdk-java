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

public class CreateDisasterRecoverGroupResponse extends AbstractModel {

    /**
    * <p>分散置放群组ID列表。</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>置放群组内可容纳的云服务器数量。</p>
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Long CvmQuotaTotal;

    /**
    * <p>置放群组内已有的云服务器数量。</p>
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * <p>分散置放群组创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，默认是分散置放群组。</p>
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时，才有该值(分区置放群组功能灰度中)。</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>分散置放群组ID列表。</p> 
     * @return DisasterRecoverGroupId <p>分散置放群组ID列表。</p>
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>分散置放群组ID列表。</p>
     * @param DisasterRecoverGroupId <p>分散置放群组ID列表。</p>
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p> 
     * @return Type <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
     * @param Type <p>分散置放群组类型，取值范围：<br><li>HOST：物理机</li><li>SW：交换机</li><li>RACK：机架</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p> 
     * @return Name <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     * @param Name <p>分散置放群组名称，长度1-60个字符，支持中、英文。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>置放群组内可容纳的云服务器数量。</p> 
     * @return CvmQuotaTotal <p>置放群组内可容纳的云服务器数量。</p>
     */
    public Long getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set <p>置放群组内可容纳的云服务器数量。</p>
     * @param CvmQuotaTotal <p>置放群组内可容纳的云服务器数量。</p>
     */
    public void setCvmQuotaTotal(Long CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get <p>置放群组内已有的云服务器数量。</p> 
     * @return CurrentNum <p>置放群组内已有的云服务器数量。</p>
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set <p>置放群组内已有的云服务器数量。</p>
     * @param CurrentNum <p>置放群组内已有的云服务器数量。</p>
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get <p>分散置放群组创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p> 
     * @return CreateTime <p>分散置放群组创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>分散置放群组创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
     * @param CreateTime <p>分散置放群组创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，默认是分散置放群组。</p> 
     * @return Strategy <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，默认是分散置放群组。</p>
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，默认是分散置放群组。</p>
     * @param Strategy <p>置放群组类型，当前支持两种，分散置放群组和分区置放群组(功能灰度中)，取值范围：PARTITION：分区置放群组，SPREAD：分散置放群组，默认是分散置放群组。</p>
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时，才有该值(分区置放群组功能灰度中)。</p> 
     * @return PartitionCount <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时，才有该值(分区置放群组功能灰度中)。</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时，才有该值(分区置放群组功能灰度中)。</p>
     * @param PartitionCount <p>分区置放群组的分区数量，取值范围：2-30，当置放群组类型是分区置放群组时，才有该值(分区置放群组功能灰度中)。</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDisasterRecoverGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisasterRecoverGroupResponse(CreateDisasterRecoverGroupResponse source) {
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CvmQuotaTotal != null) {
            this.CvmQuotaTotal = new Long(source.CvmQuotaTotal);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

