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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionItem extends AbstractModel{

    /**
    * 访问来源。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 当前访问来源活跃连接数
    */
    @SerializedName("ActiveConn")
    @Expose
    private String ActiveConn;

    /**
    * 当前访问来源总连接数
    */
    @SerializedName("AllConn")
    @Expose
    private Long AllConn;

    /**
     * Get 访问来源。 
     * @return Ip 访问来源。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 访问来源。
     * @param Ip 访问来源。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 当前访问来源活跃连接数 
     * @return ActiveConn 当前访问来源活跃连接数
     */
    public String getActiveConn() {
        return this.ActiveConn;
    }

    /**
     * Set 当前访问来源活跃连接数
     * @param ActiveConn 当前访问来源活跃连接数
     */
    public void setActiveConn(String ActiveConn) {
        this.ActiveConn = ActiveConn;
    }

    /**
     * Get 当前访问来源总连接数 
     * @return AllConn 当前访问来源总连接数
     */
    public Long getAllConn() {
        return this.AllConn;
    }

    /**
     * Set 当前访问来源总连接数
     * @param AllConn 当前访问来源总连接数
     */
    public void setAllConn(Long AllConn) {
        this.AllConn = AllConn;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ActiveConn", this.ActiveConn);
        this.setParamSimple(map, prefix + "AllConn", this.AllConn);

    }
}

