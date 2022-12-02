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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryDetailPrice extends AbstractModel{

    /**
    * 额外内网带宽价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthPrice")
    @Expose
    private InquiryBasePrice BandwidthPrice;

    /**
    * 硬盘价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskPrice")
    @Expose
    private InquiryBasePrice DiskPrice;

    /**
    * 额外分区价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionPrice")
    @Expose
    private InquiryBasePrice PartitionPrice;

    /**
    * 额外Topic价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicPrice")
    @Expose
    private InquiryBasePrice TopicPrice;

    /**
    * 实例套餐价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypePrice")
    @Expose
    private InquiryBasePrice InstanceTypePrice;

    /**
     * Get 额外内网带宽价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthPrice 额外内网带宽价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InquiryBasePrice getBandwidthPrice() {
        return this.BandwidthPrice;
    }

    /**
     * Set 额外内网带宽价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthPrice 额外内网带宽价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthPrice(InquiryBasePrice BandwidthPrice) {
        this.BandwidthPrice = BandwidthPrice;
    }

    /**
     * Get 硬盘价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskPrice 硬盘价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InquiryBasePrice getDiskPrice() {
        return this.DiskPrice;
    }

    /**
     * Set 硬盘价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskPrice 硬盘价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskPrice(InquiryBasePrice DiskPrice) {
        this.DiskPrice = DiskPrice;
    }

    /**
     * Get 额外分区价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionPrice 额外分区价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InquiryBasePrice getPartitionPrice() {
        return this.PartitionPrice;
    }

    /**
     * Set 额外分区价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionPrice 额外分区价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionPrice(InquiryBasePrice PartitionPrice) {
        this.PartitionPrice = PartitionPrice;
    }

    /**
     * Get 额外Topic价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicPrice 额外Topic价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InquiryBasePrice getTopicPrice() {
        return this.TopicPrice;
    }

    /**
     * Set 额外Topic价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicPrice 额外Topic价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicPrice(InquiryBasePrice TopicPrice) {
        this.TopicPrice = TopicPrice;
    }

    /**
     * Get 实例套餐价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypePrice 实例套餐价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InquiryBasePrice getInstanceTypePrice() {
        return this.InstanceTypePrice;
    }

    /**
     * Set 实例套餐价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypePrice 实例套餐价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypePrice(InquiryBasePrice InstanceTypePrice) {
        this.InstanceTypePrice = InstanceTypePrice;
    }

    public InquiryDetailPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryDetailPrice(InquiryDetailPrice source) {
        if (source.BandwidthPrice != null) {
            this.BandwidthPrice = new InquiryBasePrice(source.BandwidthPrice);
        }
        if (source.DiskPrice != null) {
            this.DiskPrice = new InquiryBasePrice(source.DiskPrice);
        }
        if (source.PartitionPrice != null) {
            this.PartitionPrice = new InquiryBasePrice(source.PartitionPrice);
        }
        if (source.TopicPrice != null) {
            this.TopicPrice = new InquiryBasePrice(source.TopicPrice);
        }
        if (source.InstanceTypePrice != null) {
            this.InstanceTypePrice = new InquiryBasePrice(source.InstanceTypePrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BandwidthPrice.", this.BandwidthPrice);
        this.setParamObj(map, prefix + "DiskPrice.", this.DiskPrice);
        this.setParamObj(map, prefix + "PartitionPrice.", this.PartitionPrice);
        this.setParamObj(map, prefix + "TopicPrice.", this.TopicPrice);
        this.setParamObj(map, prefix + "InstanceTypePrice.", this.InstanceTypePrice);

    }
}

