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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUrlDetectionResultResponse extends AbstractModel{

    /**
    * [查询结果]查询结果；枚举值：0 查询成功，否则查询失败
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * [固定信息]响应协议版本号
    */
    @SerializedName("RespVer")
    @Expose
    private Long RespVer;

    /**
    * [查询结果]url恶意状态
枚举值：
0-1：未知，访问暂无风险。
2 ：	风险网址，具体的恶意类型定义参考恶意大类EvilClass字段。
3-4：安全，访问无风险。

注意：查询结果EvilClass字段在Urltype=2时，才有意义。
    */
    @SerializedName("UrlType")
    @Expose
    private Long UrlType;

    /**
    * [查询结果]url恶意类型大类:{
    "1": "社工欺诈（仿冒、账号钓鱼、中奖诈骗）",
    "2": "信息诈骗（虚假充值、虚假兼职、虚假金融投资、虚假信用卡代办、网络赌博诈骗）",
    "3": "虚假销售（男女保健美容减肥产品、电子产品、虚假广告、违法销售）",
    "4": "恶意文件（病毒文件，木马文件，恶意apk文件的下载链接以及站点，挂马网站）",
    "5": "博彩网站（博彩网站，在线赌博网站）",
    "6": "色情网站（涉嫌传播色情内容，提供色情服务的网站）"
  }
    */
    @SerializedName("EvilClass")
    @Expose
    private Long EvilClass;

    /**
    * 该字段暂为空
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 该字段暂为空
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * [查询详情]url检出时间；时间戳
    */
    @SerializedName("DetectTime")
    @Expose
    private Long DetectTime;

    /**
    * 该字段暂为空
    */
    @SerializedName("Wording")
    @Expose
    private String Wording;

    /**
    * 该字段暂为空
    */
    @SerializedName("WordingTitle")
    @Expose
    private String WordingTitle;

    /**
    * [查询结果]url恶意状态说明；为UrlType字段值对应的说明
    */
    @SerializedName("UrlTypeDesc")
    @Expose
    private String UrlTypeDesc;

    /**
    * [查询结果]url恶意大类说明；为EvilClass字段值对应的说明
    */
    @SerializedName("EvilClassDesc")
    @Expose
    private String EvilClassDesc;

    /**
    * 该字段暂为空
    */
    @SerializedName("EvilTypeDesc")
    @Expose
    private String EvilTypeDesc;

    /**
    * 该字段暂为空
    */
    @SerializedName("LevelDesc")
    @Expose
    private String LevelDesc;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get [查询结果]查询结果；枚举值：0 查询成功，否则查询失败 
     * @return ResultCode [查询结果]查询结果；枚举值：0 查询成功，否则查询失败
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set [查询结果]查询结果；枚举值：0 查询成功，否则查询失败
     * @param ResultCode [查询结果]查询结果；枚举值：0 查询成功，否则查询失败
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get [固定信息]响应协议版本号 
     * @return RespVer [固定信息]响应协议版本号
     */
    public Long getRespVer() {
        return this.RespVer;
    }

    /**
     * Set [固定信息]响应协议版本号
     * @param RespVer [固定信息]响应协议版本号
     */
    public void setRespVer(Long RespVer) {
        this.RespVer = RespVer;
    }

    /**
     * Get [查询结果]url恶意状态
枚举值：
0-1：未知，访问暂无风险。
2 ：	风险网址，具体的恶意类型定义参考恶意大类EvilClass字段。
3-4：安全，访问无风险。

注意：查询结果EvilClass字段在Urltype=2时，才有意义。 
     * @return UrlType [查询结果]url恶意状态
枚举值：
0-1：未知，访问暂无风险。
2 ：	风险网址，具体的恶意类型定义参考恶意大类EvilClass字段。
3-4：安全，访问无风险。

注意：查询结果EvilClass字段在Urltype=2时，才有意义。
     */
    public Long getUrlType() {
        return this.UrlType;
    }

    /**
     * Set [查询结果]url恶意状态
枚举值：
0-1：未知，访问暂无风险。
2 ：	风险网址，具体的恶意类型定义参考恶意大类EvilClass字段。
3-4：安全，访问无风险。

注意：查询结果EvilClass字段在Urltype=2时，才有意义。
     * @param UrlType [查询结果]url恶意状态
枚举值：
0-1：未知，访问暂无风险。
2 ：	风险网址，具体的恶意类型定义参考恶意大类EvilClass字段。
3-4：安全，访问无风险。

注意：查询结果EvilClass字段在Urltype=2时，才有意义。
     */
    public void setUrlType(Long UrlType) {
        this.UrlType = UrlType;
    }

    /**
     * Get [查询结果]url恶意类型大类:{
    "1": "社工欺诈（仿冒、账号钓鱼、中奖诈骗）",
    "2": "信息诈骗（虚假充值、虚假兼职、虚假金融投资、虚假信用卡代办、网络赌博诈骗）",
    "3": "虚假销售（男女保健美容减肥产品、电子产品、虚假广告、违法销售）",
    "4": "恶意文件（病毒文件，木马文件，恶意apk文件的下载链接以及站点，挂马网站）",
    "5": "博彩网站（博彩网站，在线赌博网站）",
    "6": "色情网站（涉嫌传播色情内容，提供色情服务的网站）"
  } 
     * @return EvilClass [查询结果]url恶意类型大类:{
    "1": "社工欺诈（仿冒、账号钓鱼、中奖诈骗）",
    "2": "信息诈骗（虚假充值、虚假兼职、虚假金融投资、虚假信用卡代办、网络赌博诈骗）",
    "3": "虚假销售（男女保健美容减肥产品、电子产品、虚假广告、违法销售）",
    "4": "恶意文件（病毒文件，木马文件，恶意apk文件的下载链接以及站点，挂马网站）",
    "5": "博彩网站（博彩网站，在线赌博网站）",
    "6": "色情网站（涉嫌传播色情内容，提供色情服务的网站）"
  }
     */
    public Long getEvilClass() {
        return this.EvilClass;
    }

    /**
     * Set [查询结果]url恶意类型大类:{
    "1": "社工欺诈（仿冒、账号钓鱼、中奖诈骗）",
    "2": "信息诈骗（虚假充值、虚假兼职、虚假金融投资、虚假信用卡代办、网络赌博诈骗）",
    "3": "虚假销售（男女保健美容减肥产品、电子产品、虚假广告、违法销售）",
    "4": "恶意文件（病毒文件，木马文件，恶意apk文件的下载链接以及站点，挂马网站）",
    "5": "博彩网站（博彩网站，在线赌博网站）",
    "6": "色情网站（涉嫌传播色情内容，提供色情服务的网站）"
  }
     * @param EvilClass [查询结果]url恶意类型大类:{
    "1": "社工欺诈（仿冒、账号钓鱼、中奖诈骗）",
    "2": "信息诈骗（虚假充值、虚假兼职、虚假金融投资、虚假信用卡代办、网络赌博诈骗）",
    "3": "虚假销售（男女保健美容减肥产品、电子产品、虚假广告、违法销售）",
    "4": "恶意文件（病毒文件，木马文件，恶意apk文件的下载链接以及站点，挂马网站）",
    "5": "博彩网站（博彩网站，在线赌博网站）",
    "6": "色情网站（涉嫌传播色情内容，提供色情服务的网站）"
  }
     */
    public void setEvilClass(Long EvilClass) {
        this.EvilClass = EvilClass;
    }

    /**
     * Get 该字段暂为空 
     * @return EvilType 该字段暂为空
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 该字段暂为空
     * @param EvilType 该字段暂为空
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 该字段暂为空 
     * @return Level 该字段暂为空
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 该字段暂为空
     * @param Level 该字段暂为空
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get [查询详情]url检出时间；时间戳 
     * @return DetectTime [查询详情]url检出时间；时间戳
     */
    public Long getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set [查询详情]url检出时间；时间戳
     * @param DetectTime [查询详情]url检出时间；时间戳
     */
    public void setDetectTime(Long DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get 该字段暂为空 
     * @return Wording 该字段暂为空
     */
    public String getWording() {
        return this.Wording;
    }

    /**
     * Set 该字段暂为空
     * @param Wording 该字段暂为空
     */
    public void setWording(String Wording) {
        this.Wording = Wording;
    }

    /**
     * Get 该字段暂为空 
     * @return WordingTitle 该字段暂为空
     */
    public String getWordingTitle() {
        return this.WordingTitle;
    }

    /**
     * Set 该字段暂为空
     * @param WordingTitle 该字段暂为空
     */
    public void setWordingTitle(String WordingTitle) {
        this.WordingTitle = WordingTitle;
    }

    /**
     * Get [查询结果]url恶意状态说明；为UrlType字段值对应的说明 
     * @return UrlTypeDesc [查询结果]url恶意状态说明；为UrlType字段值对应的说明
     */
    public String getUrlTypeDesc() {
        return this.UrlTypeDesc;
    }

    /**
     * Set [查询结果]url恶意状态说明；为UrlType字段值对应的说明
     * @param UrlTypeDesc [查询结果]url恶意状态说明；为UrlType字段值对应的说明
     */
    public void setUrlTypeDesc(String UrlTypeDesc) {
        this.UrlTypeDesc = UrlTypeDesc;
    }

    /**
     * Get [查询结果]url恶意大类说明；为EvilClass字段值对应的说明 
     * @return EvilClassDesc [查询结果]url恶意大类说明；为EvilClass字段值对应的说明
     */
    public String getEvilClassDesc() {
        return this.EvilClassDesc;
    }

    /**
     * Set [查询结果]url恶意大类说明；为EvilClass字段值对应的说明
     * @param EvilClassDesc [查询结果]url恶意大类说明；为EvilClass字段值对应的说明
     */
    public void setEvilClassDesc(String EvilClassDesc) {
        this.EvilClassDesc = EvilClassDesc;
    }

    /**
     * Get 该字段暂为空 
     * @return EvilTypeDesc 该字段暂为空
     */
    public String getEvilTypeDesc() {
        return this.EvilTypeDesc;
    }

    /**
     * Set 该字段暂为空
     * @param EvilTypeDesc 该字段暂为空
     */
    public void setEvilTypeDesc(String EvilTypeDesc) {
        this.EvilTypeDesc = EvilTypeDesc;
    }

    /**
     * Get 该字段暂为空 
     * @return LevelDesc 该字段暂为空
     */
    public String getLevelDesc() {
        return this.LevelDesc;
    }

    /**
     * Set 该字段暂为空
     * @param LevelDesc 该字段暂为空
     */
    public void setLevelDesc(String LevelDesc) {
        this.LevelDesc = LevelDesc;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUrlDetectionResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUrlDetectionResultResponse(DescribeUrlDetectionResultResponse source) {
        if (source.ResultCode != null) {
            this.ResultCode = new Long(source.ResultCode);
        }
        if (source.RespVer != null) {
            this.RespVer = new Long(source.RespVer);
        }
        if (source.UrlType != null) {
            this.UrlType = new Long(source.UrlType);
        }
        if (source.EvilClass != null) {
            this.EvilClass = new Long(source.EvilClass);
        }
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new Long(source.DetectTime);
        }
        if (source.Wording != null) {
            this.Wording = new String(source.Wording);
        }
        if (source.WordingTitle != null) {
            this.WordingTitle = new String(source.WordingTitle);
        }
        if (source.UrlTypeDesc != null) {
            this.UrlTypeDesc = new String(source.UrlTypeDesc);
        }
        if (source.EvilClassDesc != null) {
            this.EvilClassDesc = new String(source.EvilClassDesc);
        }
        if (source.EvilTypeDesc != null) {
            this.EvilTypeDesc = new String(source.EvilTypeDesc);
        }
        if (source.LevelDesc != null) {
            this.LevelDesc = new String(source.LevelDesc);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "RespVer", this.RespVer);
        this.setParamSimple(map, prefix + "UrlType", this.UrlType);
        this.setParamSimple(map, prefix + "EvilClass", this.EvilClass);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "Wording", this.Wording);
        this.setParamSimple(map, prefix + "WordingTitle", this.WordingTitle);
        this.setParamSimple(map, prefix + "UrlTypeDesc", this.UrlTypeDesc);
        this.setParamSimple(map, prefix + "EvilClassDesc", this.EvilClassDesc);
        this.setParamSimple(map, prefix + "EvilTypeDesc", this.EvilTypeDesc);
        this.setParamSimple(map, prefix + "LevelDesc", this.LevelDesc);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

