package com.walletapp;

import java.util.List;

public class WalletServiceImpl implements WalletService{
    @Override
    public WalletDto registerWallet(WalletDto wallet) throws WalletException {
        return null;
    }

    @Override
    public WalletDto getWalletById(Integer walletId) throws WalletException {
        return null;
    }

    @Override
    public WalletDto updateWallet(WalletDto wallet) throws WalletException {
        return null;
    }

    @Override
    public WalletDto deleteWalletById(Integer walletId) throws WalletException {
        return null;
    }

    @Override
    public Double addFundsToWalletById(Integer walletId, Double amount) throws WalletException {
        return null;
    }

    @Override
    public Double withdrawFundsFromWalletById(Integer walletById, Double amount) throws WalletException {
        return null;
    }

    @Override
    public Boolean fundTransfer(Integer fromWalletId, Integer toWalletId, Double amount) throws WalletException {
        return null;
    }

    @Override
    public List<WalletDto> getAllWallets() {
        return null;
    }
}
