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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollingUpdateSettings extends AbstractModel{

    /**
    * 批次数量。批次数量为大于 0 的正整数，但不能大于待刷新实例数量。
    */
    @SerializedName("BatchNumber")
    @Expose
    private Long BatchNumber;

    /**
    * 批次间暂停策略。默认值为 Automatic，取值范围如下：<br><li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li><li>BATCH_INTERVAL_PAUSE：批次间暂停</li><li>AUTOMATIC：不暂停
    */
    @SerializedName("BatchPause")
    @Expose
    private String BatchPause;

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
     * Get 批次间暂停策略。默认值为 Automatic，取值范围如下：<br><li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li><li>BATCH_INTERVAL_PAUSE：批次间暂停</li><li>AUTOMATIC：不暂停 
     * @return BatchPause 批次间暂停策略。默认值为 Automatic，取值范围如下：<br><li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li><li>BATCH_INTERVAL_PAUSE：批次间暂停</li><li>AUTOMATIC：不暂停
     */
    public String getBatchPause() {
        return this.BatchPause;
    }

    /**
     * Set 批次间暂停策略。默认值为 Automatic，取值范围如下：<br><li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li><li>BATCH_INTERVAL_PAUSE：批次间暂停</li><li>AUTOMATIC：不暂停
     * @param BatchPause 批次间暂停策略。默认值为 Automatic，取值范围如下：<br><li>FIRST_BATCH_PAUSE：第一批次更新完成后暂停</li><li>BATCH_INTERVAL_PAUSE：批次间暂停</li><li>AUTOMATIC：不暂停
     */
    public void setBatchPause(String BatchPause) {
        this.BatchPause = BatchPause;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchNumber", this.BatchNumber);
        this.setParamSimple(map, prefix + "BatchPause", this.BatchPause);

    }
}

