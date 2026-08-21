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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTWeSeeTasksByConditionRequest extends AbstractModel {

    /**
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>算法类目。</p><p>枚举值：</p><ul><li>COMPREHENSION： 视觉理解</li><li>HIGHLIGHT： 视频浓缩</li></ul>
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
    * <p>任务删除条件，至少传入一个条件。不同条件之间为 AND 关系，同一条件的 Values 之间为 OR 关系。</p>
    */
    @SerializedName("Conditions")
    @Expose
    private SeeDeleteTaskCondition [] Conditions;

    /**
    * <p>通道 ID</p><p>默认值：0</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>算法类目。</p><p>枚举值：</p><ul><li>COMPREHENSION： 视觉理解</li><li>HIGHLIGHT： 视频浓缩</li></ul> 
     * @return ServiceCategory <p>算法类目。</p><p>枚举值：</p><ul><li>COMPREHENSION： 视觉理解</li><li>HIGHLIGHT： 视频浓缩</li></ul>
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set <p>算法类目。</p><p>枚举值：</p><ul><li>COMPREHENSION： 视觉理解</li><li>HIGHLIGHT： 视频浓缩</li></ul>
     * @param ServiceCategory <p>算法类目。</p><p>枚举值：</p><ul><li>COMPREHENSION： 视觉理解</li><li>HIGHLIGHT： 视频浓缩</li></ul>
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    /**
     * Get <p>任务删除条件，至少传入一个条件。不同条件之间为 AND 关系，同一条件的 Values 之间为 OR 关系。</p> 
     * @return Conditions <p>任务删除条件，至少传入一个条件。不同条件之间为 AND 关系，同一条件的 Values 之间为 OR 关系。</p>
     */
    public SeeDeleteTaskCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set <p>任务删除条件，至少传入一个条件。不同条件之间为 AND 关系，同一条件的 Values 之间为 OR 关系。</p>
     * @param Conditions <p>任务删除条件，至少传入一个条件。不同条件之间为 AND 关系，同一条件的 Values 之间为 OR 关系。</p>
     */
    public void setConditions(SeeDeleteTaskCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get <p>通道 ID</p><p>默认值：0</p> 
     * @return ChannelId <p>通道 ID</p><p>默认值：0</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID</p><p>默认值：0</p>
     * @param ChannelId <p>通道 ID</p><p>默认值：0</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DeleteTWeSeeTasksByConditionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTWeSeeTasksByConditionRequest(DeleteTWeSeeTasksByConditionRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceCategory != null) {
            this.ServiceCategory = new String(source.ServiceCategory);
        }
        if (source.Conditions != null) {
            this.Conditions = new SeeDeleteTaskCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new SeeDeleteTaskCondition(source.Conditions[i]);
            }
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceCategory", this.ServiceCategory);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

