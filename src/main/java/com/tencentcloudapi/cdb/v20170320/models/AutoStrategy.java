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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoStrategy extends AbstractModel {

    /**
    * 自动扩容阈值，可选值40、50、60、70、80、90，代表 CPU 利用率达到40%、50%、60%、70%、80%、90%时后台进行自动扩容。
    */
    @SerializedName("ExpandThreshold")
    @Expose
    private Long ExpandThreshold;

    /**
    * 自动缩容阈值，可选值10、20、30，代表CPU利用率达到10%、20%、30%时后台进行自动缩容
    */
    @SerializedName("ShrinkThreshold")
    @Expose
    private Long ShrinkThreshold;

    /**
    * 自动扩容观测周期，单位是分钟，可选值1、3、5、10、15、30。后台会按照配置的周期进行扩容判断。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpandPeriod")
    @Expose
    private Long ExpandPeriod;

    /**
    * 自动缩容观测周期，单位是分钟，可选值5、10、15、30。后台会按照配置的周期进行缩容判断。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShrinkPeriod")
    @Expose
    private Long ShrinkPeriod;

    /**
    * 弹性扩容观测周期（秒级），可取值为：5，30，45，60，180，300，600，900，1800。
    */
    @SerializedName("ExpandSecondPeriod")
    @Expose
    private Long ExpandSecondPeriod;

    /**
    * 缩容观测周期（秒级），可取值为：300。
    */
    @SerializedName("ShrinkSecondPeriod")
    @Expose
    private Long ShrinkSecondPeriod;

    /**
     * Get 自动扩容阈值，可选值40、50、60、70、80、90，代表 CPU 利用率达到40%、50%、60%、70%、80%、90%时后台进行自动扩容。 
     * @return ExpandThreshold 自动扩容阈值，可选值40、50、60、70、80、90，代表 CPU 利用率达到40%、50%、60%、70%、80%、90%时后台进行自动扩容。
     */
    public Long getExpandThreshold() {
        return this.ExpandThreshold;
    }

    /**
     * Set 自动扩容阈值，可选值40、50、60、70、80、90，代表 CPU 利用率达到40%、50%、60%、70%、80%、90%时后台进行自动扩容。
     * @param ExpandThreshold 自动扩容阈值，可选值40、50、60、70、80、90，代表 CPU 利用率达到40%、50%、60%、70%、80%、90%时后台进行自动扩容。
     */
    public void setExpandThreshold(Long ExpandThreshold) {
        this.ExpandThreshold = ExpandThreshold;
    }

    /**
     * Get 自动缩容阈值，可选值10、20、30，代表CPU利用率达到10%、20%、30%时后台进行自动缩容 
     * @return ShrinkThreshold 自动缩容阈值，可选值10、20、30，代表CPU利用率达到10%、20%、30%时后台进行自动缩容
     */
    public Long getShrinkThreshold() {
        return this.ShrinkThreshold;
    }

    /**
     * Set 自动缩容阈值，可选值10、20、30，代表CPU利用率达到10%、20%、30%时后台进行自动缩容
     * @param ShrinkThreshold 自动缩容阈值，可选值10、20、30，代表CPU利用率达到10%、20%、30%时后台进行自动缩容
     */
    public void setShrinkThreshold(Long ShrinkThreshold) {
        this.ShrinkThreshold = ShrinkThreshold;
    }

    /**
     * Get 自动扩容观测周期，单位是分钟，可选值1、3、5、10、15、30。后台会按照配置的周期进行扩容判断。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpandPeriod 自动扩容观测周期，单位是分钟，可选值1、3、5、10、15、30。后台会按照配置的周期进行扩容判断。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getExpandPeriod() {
        return this.ExpandPeriod;
    }

    /**
     * Set 自动扩容观测周期，单位是分钟，可选值1、3、5、10、15、30。后台会按照配置的周期进行扩容判断。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpandPeriod 自动扩容观测周期，单位是分钟，可选值1、3、5、10、15、30。后台会按照配置的周期进行扩容判断。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setExpandPeriod(Long ExpandPeriod) {
        this.ExpandPeriod = ExpandPeriod;
    }

    /**
     * Get 自动缩容观测周期，单位是分钟，可选值5、10、15、30。后台会按照配置的周期进行缩容判断。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShrinkPeriod 自动缩容观测周期，单位是分钟，可选值5、10、15、30。后台会按照配置的周期进行缩容判断。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getShrinkPeriod() {
        return this.ShrinkPeriod;
    }

    /**
     * Set 自动缩容观测周期，单位是分钟，可选值5、10、15、30。后台会按照配置的周期进行缩容判断。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShrinkPeriod 自动缩容观测周期，单位是分钟，可选值5、10、15、30。后台会按照配置的周期进行缩容判断。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setShrinkPeriod(Long ShrinkPeriod) {
        this.ShrinkPeriod = ShrinkPeriod;
    }

    /**
     * Get 弹性扩容观测周期（秒级），可取值为：5，30，45，60，180，300，600，900，1800。 
     * @return ExpandSecondPeriod 弹性扩容观测周期（秒级），可取值为：5，30，45，60，180，300，600，900，1800。
     */
    public Long getExpandSecondPeriod() {
        return this.ExpandSecondPeriod;
    }

    /**
     * Set 弹性扩容观测周期（秒级），可取值为：5，30，45，60，180，300，600，900，1800。
     * @param ExpandSecondPeriod 弹性扩容观测周期（秒级），可取值为：5，30，45，60，180，300，600，900，1800。
     */
    public void setExpandSecondPeriod(Long ExpandSecondPeriod) {
        this.ExpandSecondPeriod = ExpandSecondPeriod;
    }

    /**
     * Get 缩容观测周期（秒级），可取值为：300。 
     * @return ShrinkSecondPeriod 缩容观测周期（秒级），可取值为：300。
     */
    public Long getShrinkSecondPeriod() {
        return this.ShrinkSecondPeriod;
    }

    /**
     * Set 缩容观测周期（秒级），可取值为：300。
     * @param ShrinkSecondPeriod 缩容观测周期（秒级），可取值为：300。
     */
    public void setShrinkSecondPeriod(Long ShrinkSecondPeriod) {
        this.ShrinkSecondPeriod = ShrinkSecondPeriod;
    }

    public AutoStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoStrategy(AutoStrategy source) {
        if (source.ExpandThreshold != null) {
            this.ExpandThreshold = new Long(source.ExpandThreshold);
        }
        if (source.ShrinkThreshold != null) {
            this.ShrinkThreshold = new Long(source.ShrinkThreshold);
        }
        if (source.ExpandPeriod != null) {
            this.ExpandPeriod = new Long(source.ExpandPeriod);
        }
        if (source.ShrinkPeriod != null) {
            this.ShrinkPeriod = new Long(source.ShrinkPeriod);
        }
        if (source.ExpandSecondPeriod != null) {
            this.ExpandSecondPeriod = new Long(source.ExpandSecondPeriod);
        }
        if (source.ShrinkSecondPeriod != null) {
            this.ShrinkSecondPeriod = new Long(source.ShrinkSecondPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpandThreshold", this.ExpandThreshold);
        this.setParamSimple(map, prefix + "ShrinkThreshold", this.ShrinkThreshold);
        this.setParamSimple(map, prefix + "ExpandPeriod", this.ExpandPeriod);
        this.setParamSimple(map, prefix + "ShrinkPeriod", this.ShrinkPeriod);
        this.setParamSimple(map, prefix + "ExpandSecondPeriod", this.ExpandSecondPeriod);
        this.setParamSimple(map, prefix + "ShrinkSecondPeriod", this.ShrinkSecondPeriod);

    }
}

