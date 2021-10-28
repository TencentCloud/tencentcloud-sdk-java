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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotSortBy extends AbstractModel{

    /**
    * 排序参数名称， 取值为：timestamp， nums， session_duration，score.total，stat.avg_speed分别表示按照：最新检测时间，会话总次数，会话持续时间，BOT得分，平均速率排序
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * asc/desc
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
     * Get 排序参数名称， 取值为：timestamp， nums， session_duration，score.total，stat.avg_speed分别表示按照：最新检测时间，会话总次数，会话持续时间，BOT得分，平均速率排序 
     * @return Key 排序参数名称， 取值为：timestamp， nums， session_duration，score.total，stat.avg_speed分别表示按照：最新检测时间，会话总次数，会话持续时间，BOT得分，平均速率排序
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 排序参数名称， 取值为：timestamp， nums， session_duration，score.total，stat.avg_speed分别表示按照：最新检测时间，会话总次数，会话持续时间，BOT得分，平均速率排序
     * @param Key 排序参数名称， 取值为：timestamp， nums， session_duration，score.total，stat.avg_speed分别表示按照：最新检测时间，会话总次数，会话持续时间，BOT得分，平均速率排序
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get asc/desc 
     * @return Sequence asc/desc
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set asc/desc
     * @param Sequence asc/desc
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    public BotSortBy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotSortBy(BotSortBy source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Sequence != null) {
            this.Sequence = new String(source.Sequence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);

    }
}

