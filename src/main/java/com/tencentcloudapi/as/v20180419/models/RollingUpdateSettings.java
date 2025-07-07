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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollingUpdateSettings extends AbstractModel {

    /**
    * 批次数量。批次数量为大于 0 的正整数，但不能大于待刷新实例数量。
    */
    @SerializedName("BatchNumber")
    @Expose
    private Long BatchNumber;

    /**
    * 批次间暂停策略。默认值为 Automatic，取值范围如下：
<li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li>
<li>BATCH_INTERVAL_PAUSE：批次间暂停</li>
<li>AUTOMATIC：不暂停</li>
    */
    @SerializedName("BatchPause")
    @Expose
    private String BatchPause;

    /**
    * 最大额外数量。设置该参数后，在滚动更新开始前根据启动配置创建一批按量计费的额外实例，滚动更新完成后销毁额外实例。
该参数用于保证滚动更新过程中可用实例的数量，最大额外数量不能超过滚动更新单个批次的刷新实例数。回滚流程暂不支持该参数。
    */
    @SerializedName("MaxSurge")
    @Expose
    private Long MaxSurge;

    /**
    * 失败处理策略。默认值为 AUTO_PAUSE，取值范围如下：
<li>AUTO_PAUSE：刷新失败后暂停</li>
<li>AUTO_ROLLBACK：刷新失败后回滚。回滚时每批次回滚一台实例，CheckInstanceTargetHealth 参数值与原刷新活动一致。MaxSurge参数引入的扩缩容流程失败无需回滚，会用取消动作代替回滚</li>
<li>AUTO_CANCEL：刷新失败后取消</li>
    */
    @SerializedName("FailProcess")
    @Expose
    private String FailProcess;

    /**
     * Get 批次数量。批次数量为大于 0 的正整数，但不能大于待刷新实例数量。 
     * @return BatchNumber 批次数量。批次数量为大于 0 的正整数，但不能大于待刷新实例数量。
     */
    public Long getBatchNumber() {
        return this.BatchNumber;
    }

    /**
     * Set 批次数量。批次数量为大于 0 的正整数，但不能大于待刷新实例数量。
     * @param BatchNumber 批次数量。批次数量为大于 0 的正整数，但不能大于待刷新实例数量。
     */
    public void setBatchNumber(Long BatchNumber) {
        this.BatchNumber = BatchNumber;
    }

    /**
     * Get 批次间暂停策略。默认值为 Automatic，取值范围如下：
<li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li>
<li>BATCH_INTERVAL_PAUSE：批次间暂停</li>
<li>AUTOMATIC：不暂停</li> 
     * @return BatchPause 批次间暂停策略。默认值为 Automatic，取值范围如下：
<li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li>
<li>BATCH_INTERVAL_PAUSE：批次间暂停</li>
<li>AUTOMATIC：不暂停</li>
     */
    public String getBatchPause() {
        return this.BatchPause;
    }

    /**
     * Set 批次间暂停策略。默认值为 Automatic，取值范围如下：
<li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li>
<li>BATCH_INTERVAL_PAUSE：批次间暂停</li>
<li>AUTOMATIC：不暂停</li>
     * @param BatchPause 批次间暂停策略。默认值为 Automatic，取值范围如下：
<li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li>
<li>BATCH_INTERVAL_PAUSE：批次间暂停</li>
<li>AUTOMATIC：不暂停</li>
     */
    public void setBatchPause(String BatchPause) {
        this.BatchPause = BatchPause;
    }

    /**
     * Get 最大额外数量。设置该参数后，在滚动更新开始前根据启动配置创建一批按量计费的额外实例，滚动更新完成后销毁额外实例。
该参数用于保证滚动更新过程中可用实例的数量，最大额外数量不能超过滚动更新单个批次的刷新实例数。回滚流程暂不支持该参数。 
     * @return MaxSurge 最大额外数量。设置该参数后，在滚动更新开始前根据启动配置创建一批按量计费的额外实例，滚动更新完成后销毁额外实例。
该参数用于保证滚动更新过程中可用实例的数量，最大额外数量不能超过滚动更新单个批次的刷新实例数。回滚流程暂不支持该参数。
     */
    public Long getMaxSurge() {
        return this.MaxSurge;
    }

    /**
     * Set 最大额外数量。设置该参数后，在滚动更新开始前根据启动配置创建一批按量计费的额外实例，滚动更新完成后销毁额外实例。
该参数用于保证滚动更新过程中可用实例的数量，最大额外数量不能超过滚动更新单个批次的刷新实例数。回滚流程暂不支持该参数。
     * @param MaxSurge 最大额外数量。设置该参数后，在滚动更新开始前根据启动配置创建一批按量计费的额外实例，滚动更新完成后销毁额外实例。
该参数用于保证滚动更新过程中可用实例的数量，最大额外数量不能超过滚动更新单个批次的刷新实例数。回滚流程暂不支持该参数。
     */
    public void setMaxSurge(Long MaxSurge) {
        this.MaxSurge = MaxSurge;
    }

    /**
     * Get 失败处理策略。默认值为 AUTO_PAUSE，取值范围如下：
<li>AUTO_PAUSE：刷新失败后暂停</li>
<li>AUTO_ROLLBACK：刷新失败后回滚。回滚时每批次回滚一台实例，CheckInstanceTargetHealth 参数值与原刷新活动一致。MaxSurge参数引入的扩缩容流程失败无需回滚，会用取消动作代替回滚</li>
<li>AUTO_CANCEL：刷新失败后取消</li> 
     * @return FailProcess 失败处理策略。默认值为 AUTO_PAUSE，取值范围如下：
<li>AUTO_PAUSE：刷新失败后暂停</li>
<li>AUTO_ROLLBACK：刷新失败后回滚。回滚时每批次回滚一台实例，CheckInstanceTargetHealth 参数值与原刷新活动一致。MaxSurge参数引入的扩缩容流程失败无需回滚，会用取消动作代替回滚</li>
<li>AUTO_CANCEL：刷新失败后取消</li>
     */
    public String getFailProcess() {
        return this.FailProcess;
    }

    /**
     * Set 失败处理策略。默认值为 AUTO_PAUSE，取值范围如下：
<li>AUTO_PAUSE：刷新失败后暂停</li>
<li>AUTO_ROLLBACK：刷新失败后回滚。回滚时每批次回滚一台实例，CheckInstanceTargetHealth 参数值与原刷新活动一致。MaxSurge参数引入的扩缩容流程失败无需回滚，会用取消动作代替回滚</li>
<li>AUTO_CANCEL：刷新失败后取消</li>
     * @param FailProcess 失败处理策略。默认值为 AUTO_PAUSE，取值范围如下：
<li>AUTO_PAUSE：刷新失败后暂停</li>
<li>AUTO_ROLLBACK：刷新失败后回滚。回滚时每批次回滚一台实例，CheckInstanceTargetHealth 参数值与原刷新活动一致。MaxSurge参数引入的扩缩容流程失败无需回滚，会用取消动作代替回滚</li>
<li>AUTO_CANCEL：刷新失败后取消</li>
     */
    public void setFailProcess(String FailProcess) {
        this.FailProcess = FailProcess;
    }

    public RollingUpdateSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollingUpdateSettings(RollingUpdateSettings source) {
        if (source.BatchNumber != null) {
            this.BatchNumber = new Long(source.BatchNumber);
        }
        if (source.BatchPause != null) {
            this.BatchPause = new String(source.BatchPause);
        }
        if (source.MaxSurge != null) {
            this.MaxSurge = new Long(source.MaxSurge);
        }
        if (source.FailProcess != null) {
            this.FailProcess = new String(source.FailProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchNumber", this.BatchNumber);
        this.setParamSimple(map, prefix + "BatchPause", this.BatchPause);
        this.setParamSimple(map, prefix + "MaxSurge", this.MaxSurge);
        this.setParamSimple(map, prefix + "FailProcess", this.FailProcess);

    }
}

