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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintConfig extends AbstractModel{

    /**
    * 水印偏移量，取值范围[0, 100)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 是否开启，取值[
0（手动开启）
1（立即运行）
]
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
    * 水印所属的转发监听器列表
    */
    @SerializedName("Listeners")
    @Expose
    private ForwardListener [] Listeners;

    /**
    * 水印添加成功后生成的水印密钥列表，一条水印最少1个密钥，最多2个密钥
    */
    @SerializedName("Keys")
    @Expose
    private WaterPrintKey [] Keys;

    /**
    * 水印检查模式, 取值[
checkall（普通模式）
shortfpcheckall（精简模式）
]
    */
    @SerializedName("Verify")
    @Expose
    private String Verify;

    /**
     * Get 水印偏移量，取值范围[0, 100) 
     * @return Offset 水印偏移量，取值范围[0, 100)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 水印偏移量，取值范围[0, 100)
     * @param Offset 水印偏移量，取值范围[0, 100)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 是否开启，取值[
0（手动开启）
1（立即运行）
] 
     * @return OpenStatus 是否开启，取值[
0（手动开启）
1（立即运行）
]
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set 是否开启，取值[
0（手动开启）
1（立即运行）
]
     * @param OpenStatus 是否开启，取值[
0（手动开启）
1（立即运行）
]
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get 水印所属的转发监听器列表 
     * @return Listeners 水印所属的转发监听器列表
     */
    public ForwardListener [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set 水印所属的转发监听器列表
     * @param Listeners 水印所属的转发监听器列表
     */
    public void setListeners(ForwardListener [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get 水印添加成功后生成的水印密钥列表，一条水印最少1个密钥，最多2个密钥 
     * @return Keys 水印添加成功后生成的水印密钥列表，一条水印最少1个密钥，最多2个密钥
     */
    public WaterPrintKey [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 水印添加成功后生成的水印密钥列表，一条水印最少1个密钥，最多2个密钥
     * @param Keys 水印添加成功后生成的水印密钥列表，一条水印最少1个密钥，最多2个密钥
     */
    public void setKeys(WaterPrintKey [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 水印检查模式, 取值[
checkall（普通模式）
shortfpcheckall（精简模式）
] 
     * @return Verify 水印检查模式, 取值[
checkall（普通模式）
shortfpcheckall（精简模式）
]
     */
    public String getVerify() {
        return this.Verify;
    }

    /**
     * Set 水印检查模式, 取值[
checkall（普通模式）
shortfpcheckall（精简模式）
]
     * @param Verify 水印检查模式, 取值[
checkall（普通模式）
shortfpcheckall（精简模式）
]
     */
    public void setVerify(String Verify) {
        this.Verify = Verify;
    }

    public WaterPrintConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterPrintConfig(WaterPrintConfig source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new Long(source.OpenStatus);
        }
        if (source.Listeners != null) {
            this.Listeners = new ForwardListener[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new ForwardListener(source.Listeners[i]);
            }
        }
        if (source.Keys != null) {
            this.Keys = new WaterPrintKey[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new WaterPrintKey(source.Keys[i]);
            }
        }
        if (source.Verify != null) {
            this.Verify = new String(source.Verify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Verify", this.Verify);

    }
}

