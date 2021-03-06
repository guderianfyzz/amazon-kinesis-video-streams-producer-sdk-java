package com.amazonaws.kinesisvideo.producer;

import javax.annotation.Nonnull;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;

/**
 * Producer exception class extending basic {@link Exception}.
 *
 *
 */
public class ProducerException extends KinesisVideoException {
    /**
     * Various common status code.
     *
     * For the complete list of errors please refer to the errors section
     * in the public Include.h files in the native codebase.
     */
    public static final int STATUS_SUCCESS = 0x00000000;
    public static final int STATUS_BASE = 0x00000000;
    public static final int STATUS_NULL_ARG = STATUS_BASE + 0x00000001;
    public static final int STATUS_INVALID_ARG = STATUS_BASE + 0x00000002;
    public static final int STATUS_INVALID_ARG_LEN = STATUS_BASE + 0x00000003;
    public static final int STATUS_OUT_OF_MEMORY = STATUS_BASE + 0x00000004;
    public static final int STATUS_BUFFER_TOO_SMALL = STATUS_BASE + 0x00000005;
    public static final int STATUS_UNEXPECTED_EOF = STATUS_BASE + 0x00000006;
    public static final int STATUS_FORMAT_ERROR = STATUS_BASE + 0x00000007;
    public static final int STATUS_INVALID_HANDLE_ERROR = STATUS_BASE + 0x00000008;
    public static final int STATUS_OPEN_FILE_FAILED = STATUS_BASE + 0x00000009;
    public static final int STATUS_READ_FILE_FAILED = STATUS_BASE + 0x0000000a;
    public static final int STATUS_WRITE_TO_FILE_FAILED = STATUS_BASE + 0x0000000b;
    public static final int STATUS_INTERNAL_ERROR = STATUS_BASE + 0x0000000c;
    public static final int STATUS_INVALID_OPERATION = STATUS_BASE + 0x0000000d;
    public static final int STATUS_NOT_IMPLEMENTED = STATUS_BASE + 0x0000000e;
    public static final int STATUS_OPERATION_TIMED_OUT = STATUS_BASE + 0x0000000f;

    /**
     * Status code returned from native
     */
    private final int mStatusCode;

    /**
     * Static function to map {@link KinesisVideoException} to a status code
     * @param exception KinesisVideoException
     * @return status code
     */
    private static int statusCodeFromException(final @Nonnull Exception exception) {
        return STATUS_NOT_IMPLEMENTED;
    }

    public ProducerException(final @Nonnull Exception exception) {
        super(exception);
        mStatusCode = statusCodeFromException(exception);
    }

    public ProducerException(final @Nonnull String message, final int statusCode) {
        super(message);
        mStatusCode = statusCode;
    }

    public int getStatusCode() {
        return mStatusCode;
    }
}
