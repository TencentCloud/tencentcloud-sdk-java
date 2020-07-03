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

public class ModifyGroupOffsetsRequest extends AbstractModel{

    /**
    * kafka实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * kafka 消费分组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 重置offset的策略，入参含义 0. 对齐shift-by参数，代表把offset向前或向后移动shift条 1. 对齐参考(by-duration,to-datetime,to-earliest,to-latest),代表把offset移动到指定timestamp的位置 2. 对齐参考(to-offset)，代表把offset移动到指定的offset位置
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 表示需要重置的topics， 不填表示全部
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * 当strategy为0时，必须包含该字段，可以大于零代表会把offset向后移动shift条，小于零则将offset向前回溯shift条数。正确重置后新的offset应该是(old_offset + shift)，需要注意的是如果新的offset小于partition的earliest则会设置为earliest，如果大于partition 的latest则会设置为latest
    */
    @SerializedName("Shift")
    @Expose
    private Long Shift;

    /**
    * 单位ms。当strategy为1时，必须包含该字段，其中-2表示重置offset到最开始的位置，-1表示重置到最新的位置(相当于清空)，其它值则代表指定的时间，会获取topic中指定时间的offset然后进行重置，需要注意的时，如果指定的时间不存在消息，则获取最末尾的offset。
    */
    @SerializedName("ShiftTimestamp")
    @Expose
    private Long ShiftTimestamp;

    /**
    * 需要重新设置的offset位置。当strategy为2，必须包含该字段。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get kafka实例id 
     * @return InstanceId kafka实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set kafka实例id
     * @param InstanceId kafka实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get kafka 消费分组 
     * @return Group kafka 消费分组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set kafka 消费分组
     * @param Group kafka 消费分组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 重置offset的策略，入参含义 0. 对齐shift-by参数，代表把offset向前或向后移动shift条 1. 对齐参考(by-duration,to-datetime,to-earliest,to-latest),代表把offset移动到指定timestamp的位置 2. 对齐参考(to-offset)，代表把offset移动到指定的offset位置 
     * @return Strategy 重置offset的策略，入参含义 0. 对齐shift-by参数，代表把offset向前或向后移动shift条 1. 对齐参考(by-duration,to-datetime,to-earliest,to-latest),代表把offset移动到指定timestamp的位置 2. 对齐参考(to-offset)，代表把offset移动到指定的offset位置
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 重置offset的策略，入参含义 0. 对齐shift-by参数，代表把offset向前或向后移动shift条 1. 对齐参考(by-duration,to-datetime,to-earliest,to-latest),代表把offset移动到指定timestamp的位置 2. 对齐参考(to-offset)，代表把offset移动到指定的offset位置
     * @param Strategy 重置offset的策略，入参含义 0. 对齐shift-by参数，代表把offset向前或向后移动shift条 1. 对齐参考(by-duration,to-datetime,to-earliest,to-latest),代表把offset移动到指定timestamp的位置 2. 对齐参考(to-offset)，代表把offset移动到指定的offset位置
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 表示需要重置的topics， 不填表示全部 
     * @return Topics 表示需要重置的topics， 不填表示全部
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set 表示需要重置的topics， 不填表示全部
     * @param Topics 表示需要重置的topics， 不填表示全部
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get 当strategy为0时，必须包含该字段，可以大于零代表会把offset向后移动shift条，小于零则将offset向前回溯shift条数。正确重置后新的offset应该是(old_offset + shift)，需要注意的是如果新的offset小于partition的earliest则会设置为earliest，如果大于partition 的latest则会设置为latest 
     * @return Shift 当strategy为0时，必须包含该字段，可以大于零代表会把offset向后移动shift条，小于零则将offset向前回溯shift条数。正确重置后新的offset应该是(old_offset + shift)，需要注意的是如果新的offset小于partition的earliest则会设置为earliest，如果大于partition 的latest则会设置为latest
     */
    public Long getShift() {
        return this.Shift;
    }

    /**
     * Set 当strategy为0时，必须包含该字段，可以大于零代表会把offset向后移动shift条，小于零则将offset向前回溯shift条数。正确重置后新的offset应该是(old_offset + shift)，需要注意的是如果新的offset小于partition的earliest则会设置为earliest，如果大于partition 的latest则会设置为latest
     * @param Shift 当strategy为0时，必须包含该字段，可以大于零代表会把offset向后移动shift条，小于零则将offset向前回溯shift条数。正确重置后新的offset应该是(old_offset + shift)，需要注意的是如果新的offset小于partition的earliest则会设置为earliest，如果大于partition 的latest则会设置为latest
     */
    public void setShift(Long Shift) {
        this.Shift = Shift;
    }

    /**
     * Get 单位ms。当strategy为1时，必须包含该字段，其中-2表示重置offset到最开始的位置，-1表示重置到最新的位置(相当于清空)，其它值则代表指定的时间，会获取topic中指定时间的offset然后进行重置，需要注意的时，如果指定的时间不存在消息，则获取最末尾的offset。 
     * @return ShiftTimestamp 单位ms。当strategy为1时，必须包含该字段，其中-2表示重置offset到最开始的位置，-1表示重置到最新的位置(相当于清空)，其它值则代表指定的时间，会获取topic中指定时间的offset然后进行重置，需要注意的时，如果指定的时间不存在消息，则获取最末尾的offset。
     */
    public Long getShiftTimestamp() {
        return this.ShiftTimestamp;
    }

    /**
     * Set 单位ms。当strategy为1时，必须包含该字段，其中-2表示重置offset到最开始的位置，-1表示重置到最新的位置(相当于清空)，其它值则代表指定的时间，会获取topic中指定时间的offset然后进行重置，需要注意的时，如果指定的时间不存在消息，则获取最末尾的offset。
     * @param ShiftTimestamp 单位ms。当strategy为1时，必须包含该字段，其中-2表示重置offset到最开始的位置，-1表示重置到最新的位置(相当于清空)，其它值则代表指定的时间，会获取topic中指定时间的offset然后进行重置，需要注意的时，如果指定的时间不存在消息，则获取最末尾的offset。
     */
    public void setShiftTimestamp(Long ShiftTimestamp) {
        this.ShiftTimestamp = ShiftTimestamp;
    }

    /**
     * Get 需要重新设置的offset位置。当strategy为2，必须包含该字段。 
     * @return Offset 需要重新设置的offset位置。当strategy为2，必须包含该字段。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 需要重新设置的offset位置。当strategy为2，必须包含该字段。
     * @param Offset 需要重新设置的offset位置。当strategy为2，必须包含该字段。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Shift", this.Shift);
        this.setParamSimple(map, prefix + "ShiftTimestamp", this.ShiftTimestamp);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

