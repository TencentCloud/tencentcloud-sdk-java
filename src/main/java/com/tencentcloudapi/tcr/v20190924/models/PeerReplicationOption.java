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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeerReplicationOption extends AbstractModel{

    /**
    * 待同步实例的uin
    */
    @SerializedName("PeerRegistryUin")
    @Expose
    private String PeerRegistryUin;

    /**
    * 待同步实例的访问永久Token
    */
    @SerializedName("PeerRegistryToken")
    @Expose
    private String PeerRegistryToken;

    /**
    * 是否开启跨主账号实例同步
    */
    @SerializedName("EnablePeerReplication")
    @Expose
    private Boolean EnablePeerReplication;

    /**
     * Get 待同步实例的uin 
     * @return PeerRegistryUin 待同步实例的uin
     */
    public String getPeerRegistryUin() {
        return this.PeerRegistryUin;
    }

    /**
     * Set 待同步实例的uin
     * @param PeerRegistryUin 待同步实例的uin
     */
    public void setPeerRegistryUin(String PeerRegistryUin) {
        this.PeerRegistryUin = PeerRegistryUin;
    }

    /**
     * Get 待同步实例的访问永久Token 
     * @return PeerRegistryToken 待同步实例的访问永久Token
     */
    public String getPeerRegistryToken() {
        return this.PeerRegistryToken;
    }

    /**
     * Set 待同步实例的访问永久Token
     * @param PeerRegistryToken 待同步实例的访问永久Token
     */
    public void setPeerRegistryToken(String PeerRegistryToken) {
        this.PeerRegistryToken = PeerRegistryToken;
    }

    /**
     * Get 是否开启跨主账号实例同步 
     * @return EnablePeerReplication 是否开启跨主账号实例同步
     */
    public Boolean getEnablePeerReplication() {
        return this.EnablePeerReplication;
    }

    /**
     * Set 是否开启跨主账号实例同步
     * @param EnablePeerReplication 是否开启跨主账号实例同步
     */
    public void setEnablePeerReplication(Boolean EnablePeerReplication) {
        this.EnablePeerReplication = EnablePeerReplication;
    }

    public PeerReplicationOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeerReplicationOption(PeerReplicationOption source) {
        if (source.PeerRegistryUin != null) {
            this.PeerRegistryUin = new String(source.PeerRegistryUin);
        }
        if (source.PeerRegistryToken != null) {
            this.PeerRegistryToken = new String(source.PeerRegistryToken);
        }
        if (source.EnablePeerReplication != null) {
            this.EnablePeerReplication = new Boolean(source.EnablePeerReplication);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerRegistryUin", this.PeerRegistryUin);
        this.setParamSimple(map, prefix + "PeerRegistryToken", this.PeerRegistryToken);
        this.setParamSimple(map, prefix + "EnablePeerReplication", this.EnablePeerReplication);

    }
}

