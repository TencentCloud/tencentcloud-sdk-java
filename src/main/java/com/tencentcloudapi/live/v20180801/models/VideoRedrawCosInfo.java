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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoRedrawCosInfo extends AbstractModel {

    /**
    * <p>cos所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>cos桶信息</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>任务存放cos的目录</p>
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * <p>临时Cos SecretId</p>
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * <p>临时Cos SecretKey</p>
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * <p>临时token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
     * Get <p>cos所在地域</p> 
     * @return Region <p>cos所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>cos所在地域</p>
     * @param Region <p>cos所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>cos桶信息</p> 
     * @return Bucket <p>cos桶信息</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>cos桶信息</p>
     * @param Bucket <p>cos桶信息</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>任务存放cos的目录</p> 
     * @return Dir <p>任务存放cos的目录</p>
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set <p>任务存放cos的目录</p>
     * @param Dir <p>任务存放cos的目录</p>
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get <p>临时Cos SecretId</p> 
     * @return TmpSecretId <p>临时Cos SecretId</p>
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set <p>临时Cos SecretId</p>
     * @param TmpSecretId <p>临时Cos SecretId</p>
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get <p>临时Cos SecretKey</p> 
     * @return TmpSecretKey <p>临时Cos SecretKey</p>
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set <p>临时Cos SecretKey</p>
     * @param TmpSecretKey <p>临时Cos SecretKey</p>
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get <p>临时token</p> 
     * @return Token <p>临时token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>临时token</p>
     * @param Token <p>临时token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    public VideoRedrawCosInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoRedrawCosInfo(VideoRedrawCosInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Dir", this.Dir);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);

    }
}

