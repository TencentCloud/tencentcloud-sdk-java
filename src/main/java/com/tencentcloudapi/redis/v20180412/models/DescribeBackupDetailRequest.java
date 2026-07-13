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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDetailRequest extends AbstractModel {

    /**
    * <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>备份 ID，可通过接口 <a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a> 返回的参数 <strong>RedisBackupSet</strong> 获取。</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
     * Get <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID，请登录<a href="https://console.cloud.tencent.com/redis/instance/list">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>备份 ID，可通过接口 <a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a> 返回的参数 <strong>RedisBackupSet</strong> 获取。</p> 
     * @return BackupId <p>备份 ID，可通过接口 <a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a> 返回的参数 <strong>RedisBackupSet</strong> 获取。</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>备份 ID，可通过接口 <a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a> 返回的参数 <strong>RedisBackupSet</strong> 获取。</p>
     * @param BackupId <p>备份 ID，可通过接口 <a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a> 返回的参数 <strong>RedisBackupSet</strong> 获取。</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    public DescribeBackupDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDetailRequest(DescribeBackupDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

