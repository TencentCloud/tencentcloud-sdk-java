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

public class ModifyInstancesDisasterRecoverGroupRequest extends AbstractModel {

    /**
    * <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728"> DescribeInstances </a>接口返回值中的<code>InstanceId</code>获取。每次请求批量实例的上限为100</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>是否强制更换实例宿主机。取值范围：<br><li>true：表示允许实例更换宿主机，允许重启实例。本地盘子机不支持指定此参数。</li><br><li>false：不允许实例更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li><br><br>默认取值：false</p>
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
    * <p>置放群组id列表(目前仅支持指定一个)</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>分区置放群组的分区Id，取值范围：1-10，具体取决于所选置放群组的分区数量，如果选中的置放群组是分区置放群组，该值不传默认随机(该功能灰度中)</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
     * Get <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728"> DescribeInstances </a>接口返回值中的<code>InstanceId</code>获取。每次请求批量实例的上限为100</p> 
     * @return InstanceIds <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728"> DescribeInstances </a>接口返回值中的<code>InstanceId</code>获取。每次请求批量实例的上限为100</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728"> DescribeInstances </a>接口返回值中的<code>InstanceId</code>获取。每次请求批量实例的上限为100</p>
     * @param InstanceIds <p>一个或多个待操作的实例ID。可通过<a href="https://cloud.tencent.com/document/api/213/15728"> DescribeInstances </a>接口返回值中的<code>InstanceId</code>获取。每次请求批量实例的上限为100</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取</p> 
     * @return DisasterRecoverGroupId <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取</p>
     * @deprecated
     */
    @Deprecated
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取</p>
     * @param DisasterRecoverGroupId <p>分散置放群组ID，可使用<a href="https://cloud.tencent.com/document/api/213/17810">DescribeDisasterRecoverGroups</a>接口获取</p>
     * @deprecated
     */
    @Deprecated
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>是否强制更换实例宿主机。取值范围：<br><li>true：表示允许实例更换宿主机，允许重启实例。本地盘子机不支持指定此参数。</li><br><li>false：不允许实例更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li><br><br>默认取值：false</p> 
     * @return Force <p>是否强制更换实例宿主机。取值范围：<br><li>true：表示允许实例更换宿主机，允许重启实例。本地盘子机不支持指定此参数。</li><br><li>false：不允许实例更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li><br><br>默认取值：false</p>
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set <p>是否强制更换实例宿主机。取值范围：<br><li>true：表示允许实例更换宿主机，允许重启实例。本地盘子机不支持指定此参数。</li><br><li>false：不允许实例更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li><br><br>默认取值：false</p>
     * @param Force <p>是否强制更换实例宿主机。取值范围：<br><li>true：表示允许实例更换宿主机，允许重启实例。本地盘子机不支持指定此参数。</li><br><li>false：不允许实例更换宿主机，只在当前宿主机上加入置放群组。这可能导致更换置放群组失败。</li><br><br>默认取值：false</p>
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Get <p>置放群组id列表(目前仅支持指定一个)</p> 
     * @return DisasterRecoverGroupIds <p>置放群组id列表(目前仅支持指定一个)</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>置放群组id列表(目前仅支持指定一个)</p>
     * @param DisasterRecoverGroupIds <p>置放群组id列表(目前仅支持指定一个)</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>分区置放群组的分区Id，取值范围：1-10，具体取决于所选置放群组的分区数量，如果选中的置放群组是分区置放群组，该值不传默认随机(该功能灰度中)</p> 
     * @return PartitionNumber <p>分区置放群组的分区Id，取值范围：1-10，具体取决于所选置放群组的分区数量，如果选中的置放群组是分区置放群组，该值不传默认随机(该功能灰度中)</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>分区置放群组的分区Id，取值范围：1-10，具体取决于所选置放群组的分区数量，如果选中的置放群组是分区置放群组，该值不传默认随机(该功能灰度中)</p>
     * @param PartitionNumber <p>分区置放群组的分区Id，取值范围：1-10，具体取决于所选置放群组的分区数量，如果选中的置放群组是分区置放群组，该值不传默认随机(该功能灰度中)</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    public ModifyInstancesDisasterRecoverGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesDisasterRecoverGroupRequest(ModifyInstancesDisasterRecoverGroupRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

