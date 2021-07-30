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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataForward extends AbstractModel{

    /**
    * 产品ID。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 转发地址。
    */
    @SerializedName("ForwardAddr")
    @Expose
    private String ForwardAddr;

    /**
    * 转发状态。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataChose")
    @Expose
    private Long DataChose;

    /**
     * Get 产品ID。 
     * @return ProductId 产品ID。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID。
     * @param ProductId 产品ID。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 转发地址。 
     * @return ForwardAddr 转发地址。
     */
    public String getForwardAddr() {
        return this.ForwardAddr;
    }

    /**
     * Set 转发地址。
     * @param ForwardAddr 转发地址。
     */
    public void setForwardAddr(String ForwardAddr) {
        this.ForwardAddr = ForwardAddr;
    }

    /**
     * Get 转发状态。 
     * @return Status 转发状态。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 转发状态。
     * @param Status 转发状态。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataChose 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataChose() {
        return this.DataChose;
    }

    /**
     * Set 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataChose 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataChose(Long DataChose) {
        this.DataChose = DataChose;
    }

    public DataForward() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataForward(DataForward source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ForwardAddr != null) {
            this.ForwardAddr = new String(source.ForwardAddr);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.DataChose != null) {
            this.DataChose = new Long(source.DataChose);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ForwardAddr", this.ForwardAddr);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DataChose", this.DataChose);

    }
}

