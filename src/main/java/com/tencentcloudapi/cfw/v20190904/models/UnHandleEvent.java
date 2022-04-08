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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnHandleEvent extends AbstractModel{

    /**
    * 伪攻击链类型
    */
    @SerializedName("EventTableListStruct")
    @Expose
    private UnHandleEventDetail [] EventTableListStruct;

    /**
    * 1 是  0否
    */
    @SerializedName("BaseLineUser")
    @Expose
    private Long BaseLineUser;

    /**
    * 1 打开 0 关闭
    */
    @SerializedName("BaseLineInSwitch")
    @Expose
    private Long BaseLineInSwitch;

    /**
    * 1 打开 0 关闭
    */
    @SerializedName("BaseLineOutSwitch")
    @Expose
    private Long BaseLineOutSwitch;

    /**
    * vpc间防火墙实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcFwCount")
    @Expose
    private Long VpcFwCount;

    /**
     * Get 伪攻击链类型 
     * @return EventTableListStruct 伪攻击链类型
     */
    public UnHandleEventDetail [] getEventTableListStruct() {
        return this.EventTableListStruct;
    }

    /**
     * Set 伪攻击链类型
     * @param EventTableListStruct 伪攻击链类型
     */
    public void setEventTableListStruct(UnHandleEventDetail [] EventTableListStruct) {
        this.EventTableListStruct = EventTableListStruct;
    }

    /**
     * Get 1 是  0否 
     * @return BaseLineUser 1 是  0否
     */
    public Long getBaseLineUser() {
        return this.BaseLineUser;
    }

    /**
     * Set 1 是  0否
     * @param BaseLineUser 1 是  0否
     */
    public void setBaseLineUser(Long BaseLineUser) {
        this.BaseLineUser = BaseLineUser;
    }

    /**
     * Get 1 打开 0 关闭 
     * @return BaseLineInSwitch 1 打开 0 关闭
     */
    public Long getBaseLineInSwitch() {
        return this.BaseLineInSwitch;
    }

    /**
     * Set 1 打开 0 关闭
     * @param BaseLineInSwitch 1 打开 0 关闭
     */
    public void setBaseLineInSwitch(Long BaseLineInSwitch) {
        this.BaseLineInSwitch = BaseLineInSwitch;
    }

    /**
     * Get 1 打开 0 关闭 
     * @return BaseLineOutSwitch 1 打开 0 关闭
     */
    public Long getBaseLineOutSwitch() {
        return this.BaseLineOutSwitch;
    }

    /**
     * Set 1 打开 0 关闭
     * @param BaseLineOutSwitch 1 打开 0 关闭
     */
    public void setBaseLineOutSwitch(Long BaseLineOutSwitch) {
        this.BaseLineOutSwitch = BaseLineOutSwitch;
    }

    /**
     * Get vpc间防火墙实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcFwCount vpc间防火墙实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVpcFwCount() {
        return this.VpcFwCount;
    }

    /**
     * Set vpc间防火墙实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcFwCount vpc间防火墙实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcFwCount(Long VpcFwCount) {
        this.VpcFwCount = VpcFwCount;
    }

    public UnHandleEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnHandleEvent(UnHandleEvent source) {
        if (source.EventTableListStruct != null) {
            this.EventTableListStruct = new UnHandleEventDetail[source.EventTableListStruct.length];
            for (int i = 0; i < source.EventTableListStruct.length; i++) {
                this.EventTableListStruct[i] = new UnHandleEventDetail(source.EventTableListStruct[i]);
            }
        }
        if (source.BaseLineUser != null) {
            this.BaseLineUser = new Long(source.BaseLineUser);
        }
        if (source.BaseLineInSwitch != null) {
            this.BaseLineInSwitch = new Long(source.BaseLineInSwitch);
        }
        if (source.BaseLineOutSwitch != null) {
            this.BaseLineOutSwitch = new Long(source.BaseLineOutSwitch);
        }
        if (source.VpcFwCount != null) {
            this.VpcFwCount = new Long(source.VpcFwCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventTableListStruct.", this.EventTableListStruct);
        this.setParamSimple(map, prefix + "BaseLineUser", this.BaseLineUser);
        this.setParamSimple(map, prefix + "BaseLineInSwitch", this.BaseLineInSwitch);
        this.setParamSimple(map, prefix + "BaseLineOutSwitch", this.BaseLineOutSwitch);
        this.setParamSimple(map, prefix + "VpcFwCount", this.VpcFwCount);

    }
}

