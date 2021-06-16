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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TakeMusicOffShelves extends AbstractModel{

    /**
    * 资源方对应音乐Id
    */
    @SerializedName("MusicIds")
    @Expose
    private String MusicIds;

    /**
    * 当曲目临时下架时：已订购客户无影响，无需消息通知。当曲目封杀下架后，推送消息至已订购老客户，枚举值，判断是否上/下架
在售状态，0在售，1临时下架，2永久下架
    */
    @SerializedName("SaleStatus")
    @Expose
    private String SaleStatus;

    /**
     * Get 资源方对应音乐Id 
     * @return MusicIds 资源方对应音乐Id
     */
    public String getMusicIds() {
        return this.MusicIds;
    }

    /**
     * Set 资源方对应音乐Id
     * @param MusicIds 资源方对应音乐Id
     */
    public void setMusicIds(String MusicIds) {
        this.MusicIds = MusicIds;
    }

    /**
     * Get 当曲目临时下架时：已订购客户无影响，无需消息通知。当曲目封杀下架后，推送消息至已订购老客户，枚举值，判断是否上/下架
在售状态，0在售，1临时下架，2永久下架 
     * @return SaleStatus 当曲目临时下架时：已订购客户无影响，无需消息通知。当曲目封杀下架后，推送消息至已订购老客户，枚举值，判断是否上/下架
在售状态，0在售，1临时下架，2永久下架
     */
    public String getSaleStatus() {
        return this.SaleStatus;
    }

    /**
     * Set 当曲目临时下架时：已订购客户无影响，无需消息通知。当曲目封杀下架后，推送消息至已订购老客户，枚举值，判断是否上/下架
在售状态，0在售，1临时下架，2永久下架
     * @param SaleStatus 当曲目临时下架时：已订购客户无影响，无需消息通知。当曲目封杀下架后，推送消息至已订购老客户，枚举值，判断是否上/下架
在售状态，0在售，1临时下架，2永久下架
     */
    public void setSaleStatus(String SaleStatus) {
        this.SaleStatus = SaleStatus;
    }

    public TakeMusicOffShelves() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TakeMusicOffShelves(TakeMusicOffShelves source) {
        if (source.MusicIds != null) {
            this.MusicIds = new String(source.MusicIds);
        }
        if (source.SaleStatus != null) {
            this.SaleStatus = new String(source.SaleStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicIds", this.MusicIds);
        this.setParamSimple(map, prefix + "SaleStatus", this.SaleStatus);

    }
}

