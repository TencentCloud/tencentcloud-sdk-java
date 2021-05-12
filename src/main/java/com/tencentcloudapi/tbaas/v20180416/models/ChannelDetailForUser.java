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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDetailForUser extends AbstractModel{

    /**
    * 通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 当前组织加入通道的节点列表
    */
    @SerializedName("PeerList")
    @Expose
    private PeerDetailForUser [] PeerList;

    /**
     * Get 通道名称 
     * @return ChannelName 通道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通道名称
     * @param ChannelName 通道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 当前组织加入通道的节点列表 
     * @return PeerList 当前组织加入通道的节点列表
     */
    public PeerDetailForUser [] getPeerList() {
        return this.PeerList;
    }

    /**
     * Set 当前组织加入通道的节点列表
     * @param PeerList 当前组织加入通道的节点列表
     */
    public void setPeerList(PeerDetailForUser [] PeerList) {
        this.PeerList = PeerList;
    }

    public ChannelDetailForUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDetailForUser(ChannelDetailForUser source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PeerList != null) {
            this.PeerList = new PeerDetailForUser[source.PeerList.length];
            for (int i = 0; i < source.PeerList.length; i++) {
                this.PeerList[i] = new PeerDetailForUser(source.PeerList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArrayObj(map, prefix + "PeerList.", this.PeerList);

    }
}

