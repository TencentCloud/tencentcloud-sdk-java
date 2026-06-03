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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionItem extends AbstractModel {

    /**
    * <p>访问来源。</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>当前访问来源活跃连接数</p>
    */
    @SerializedName("ActiveConn")
    @Expose
    private String ActiveConn;

    /**
    * <p>当前访问来源总连接数</p>
    */
    @SerializedName("AllConn")
    @Expose
    private Long AllConn;

    /**
    * <p>是否为内网ip</p>
    */
    @SerializedName("IsInternalIp")
    @Expose
    private Boolean IsInternalIp;

    /**
     * Get <p>访问来源。</p> 
     * @return Ip <p>访问来源。</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>访问来源。</p>
     * @param Ip <p>访问来源。</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>当前访问来源活跃连接数</p> 
     * @return ActiveConn <p>当前访问来源活跃连接数</p>
     */
    public String getActiveConn() {
        return this.ActiveConn;
    }

    /**
     * Set <p>当前访问来源活跃连接数</p>
     * @param ActiveConn <p>当前访问来源活跃连接数</p>
     */
    public void setActiveConn(String ActiveConn) {
        this.ActiveConn = ActiveConn;
    }

    /**
     * Get <p>当前访问来源总连接数</p> 
     * @return AllConn <p>当前访问来源总连接数</p>
     */
    public Long getAllConn() {
        return this.AllConn;
    }

    /**
     * Set <p>当前访问来源总连接数</p>
     * @param AllConn <p>当前访问来源总连接数</p>
     */
    public void setAllConn(Long AllConn) {
        this.AllConn = AllConn;
    }

    /**
     * Get <p>是否为内网ip</p> 
     * @return IsInternalIp <p>是否为内网ip</p>
     */
    public Boolean getIsInternalIp() {
        return this.IsInternalIp;
    }

    /**
     * Set <p>是否为内网ip</p>
     * @param IsInternalIp <p>是否为内网ip</p>
     */
    public void setIsInternalIp(Boolean IsInternalIp) {
        this.IsInternalIp = IsInternalIp;
    }

    public SessionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionItem(SessionItem source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ActiveConn != null) {
            this.ActiveConn = new String(source.ActiveConn);
        }
        if (source.AllConn != null) {
            this.AllConn = new Long(source.AllConn);
        }
        if (source.IsInternalIp != null) {
            this.IsInternalIp = new Boolean(source.IsInternalIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ActiveConn", this.ActiveConn);
        this.setParamSimple(map, prefix + "AllConn", this.AllConn);
        this.setParamSimple(map, prefix + "IsInternalIp", this.IsInternalIp);

    }
}

