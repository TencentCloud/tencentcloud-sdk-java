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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkAddress extends AbstractModel {

    /**
    * <p>新IP地址。</p>
    */
    @SerializedName("NewIPAddress")
    @Expose
    private String NewIPAddress;

    /**
    * <p>原IP地址。</p>
    */
    @SerializedName("OldIpAddress")
    @Expose
    private String OldIpAddress;

    /**
    * <p>在副本集时，修改网络需要传此字段，用于标识该ip地址为主节点或者hidden节点</p><p>枚举值：</p><ul><li>PRIMARY： 主节点</li><li>HIDDEN： hidden节点</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get <p>新IP地址。</p> 
     * @return NewIPAddress <p>新IP地址。</p>
     */
    public String getNewIPAddress() {
        return this.NewIPAddress;
    }

    /**
     * Set <p>新IP地址。</p>
     * @param NewIPAddress <p>新IP地址。</p>
     */
    public void setNewIPAddress(String NewIPAddress) {
        this.NewIPAddress = NewIPAddress;
    }

    /**
     * Get <p>原IP地址。</p> 
     * @return OldIpAddress <p>原IP地址。</p>
     */
    public String getOldIpAddress() {
        return this.OldIpAddress;
    }

    /**
     * Set <p>原IP地址。</p>
     * @param OldIpAddress <p>原IP地址。</p>
     */
    public void setOldIpAddress(String OldIpAddress) {
        this.OldIpAddress = OldIpAddress;
    }

    /**
     * Get <p>在副本集时，修改网络需要传此字段，用于标识该ip地址为主节点或者hidden节点</p><p>枚举值：</p><ul><li>PRIMARY： 主节点</li><li>HIDDEN： hidden节点</li></ul> 
     * @return NodeType <p>在副本集时，修改网络需要传此字段，用于标识该ip地址为主节点或者hidden节点</p><p>枚举值：</p><ul><li>PRIMARY： 主节点</li><li>HIDDEN： hidden节点</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>在副本集时，修改网络需要传此字段，用于标识该ip地址为主节点或者hidden节点</p><p>枚举值：</p><ul><li>PRIMARY： 主节点</li><li>HIDDEN： hidden节点</li></ul>
     * @param NodeType <p>在副本集时，修改网络需要传此字段，用于标识该ip地址为主节点或者hidden节点</p><p>枚举值：</p><ul><li>PRIMARY： 主节点</li><li>HIDDEN： hidden节点</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public ModifyNetworkAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkAddress(ModifyNetworkAddress source) {
        if (source.NewIPAddress != null) {
            this.NewIPAddress = new String(source.NewIPAddress);
        }
        if (source.OldIpAddress != null) {
            this.OldIpAddress = new String(source.OldIpAddress);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NewIPAddress", this.NewIPAddress);
        this.setParamSimple(map, prefix + "OldIpAddress", this.OldIpAddress);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

