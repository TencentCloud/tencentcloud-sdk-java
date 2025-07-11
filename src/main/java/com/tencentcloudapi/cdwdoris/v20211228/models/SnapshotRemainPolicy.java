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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotRemainPolicy extends AbstractModel {

    /**
    * 0-不主动删除；1-超过指定时间周期自动删除；2-保留指定数据快照
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 保留快照的时间
    */
    @SerializedName("RemainDays")
    @Expose
    private Long RemainDays;

    /**
    * 保留最新快照的数量
    */
    @SerializedName("RemainLatestNum")
    @Expose
    private Long RemainLatestNum;

    /**
     * Get 0-不主动删除；1-超过指定时间周期自动删除；2-保留指定数据快照 
     * @return Type 0-不主动删除；1-超过指定时间周期自动删除；2-保留指定数据快照
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0-不主动删除；1-超过指定时间周期自动删除；2-保留指定数据快照
     * @param Type 0-不主动删除；1-超过指定时间周期自动删除；2-保留指定数据快照
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 保留快照的时间 
     * @return RemainDays 保留快照的时间
     */
    public Long getRemainDays() {
        return this.RemainDays;
    }

    /**
     * Set 保留快照的时间
     * @param RemainDays 保留快照的时间
     */
    public void setRemainDays(Long RemainDays) {
        this.RemainDays = RemainDays;
    }

    /**
     * Get 保留最新快照的数量 
     * @return RemainLatestNum 保留最新快照的数量
     */
    public Long getRemainLatestNum() {
        return this.RemainLatestNum;
    }

    /**
     * Set 保留最新快照的数量
     * @param RemainLatestNum 保留最新快照的数量
     */
    public void setRemainLatestNum(Long RemainLatestNum) {
        this.RemainLatestNum = RemainLatestNum;
    }

    public SnapshotRemainPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotRemainPolicy(SnapshotRemainPolicy source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RemainDays != null) {
            this.RemainDays = new Long(source.RemainDays);
        }
        if (source.RemainLatestNum != null) {
            this.RemainLatestNum = new Long(source.RemainLatestNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RemainDays", this.RemainDays);
        this.setParamSimple(map, prefix + "RemainLatestNum", this.RemainLatestNum);

    }
}

