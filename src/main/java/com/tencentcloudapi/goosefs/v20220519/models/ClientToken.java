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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientToken extends AbstractModel{

    /**
    * 节点 IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 挂载点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalDirectory")
    @Expose
    private String LocalDirectory;

    /**
    * 可以访问的 GooseFS 目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GooseFSDirectory")
    @Expose
    private String GooseFSDirectory;

    /**
    * token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
     * Get 节点 IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIp 节点 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 节点 IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIp 节点 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 挂载点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalDirectory 挂载点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalDirectory() {
        return this.LocalDirectory;
    }

    /**
     * Set 挂载点
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalDirectory 挂载点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalDirectory(String LocalDirectory) {
        this.LocalDirectory = LocalDirectory;
    }

    /**
     * Get 可以访问的 GooseFS 目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GooseFSDirectory 可以访问的 GooseFS 目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGooseFSDirectory() {
        return this.GooseFSDirectory;
    }

    /**
     * Set 可以访问的 GooseFS 目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param GooseFSDirectory 可以访问的 GooseFS 目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGooseFSDirectory(String GooseFSDirectory) {
        this.GooseFSDirectory = GooseFSDirectory;
    }

    /**
     * Get token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set token
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    public ClientToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientToken(ClientToken source) {
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.LocalDirectory != null) {
            this.LocalDirectory = new String(source.LocalDirectory);
        }
        if (source.GooseFSDirectory != null) {
            this.GooseFSDirectory = new String(source.GooseFSDirectory);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "LocalDirectory", this.LocalDirectory);
        this.setParamSimple(map, prefix + "GooseFSDirectory", this.GooseFSDirectory);
        this.setParamSimple(map, prefix + "Token", this.Token);

    }
}

